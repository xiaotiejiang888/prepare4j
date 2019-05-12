package com.prepare4j.zmy.prepare4gf.diyThread;

import java.util.Date;

public class MyThread extends Thread {
    private final Date creationDate;
    private Date startDate;
    private Date finishDate;

    public MyThread(Runnable target, String name ){
        super(target,name);
        creationDate = new Date();
    }
    public Date getCreationDate() {
        return creationDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public synchronized void setStartDate() {
        startDate=new Date();
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public synchronized void setFinishDate() {
        finishDate=new Date();
    }
    public synchronized long getExecutionTime() {
        return finishDate.getTime()-startDate.getTime();
    }


    @Override
    public void run() {
        setStartDate();
        super.run();
        setFinishDate();
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MyThread{");
        sb.append(getName());
        sb.append("creationDate=").append(creationDate);
        sb.append(" : Running time: ");
        sb.append(getExecutionTime());
        sb.append(" Milliseconds.");
        sb.append('}');
        return sb.toString();
    }
}
