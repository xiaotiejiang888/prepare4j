package com.prepare4j.zmy.el;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.common.TemplateParserContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ElTest {
    public static void main(String[] args) {
        //测试SpringEL解析器
        String template = "#{#user}，早上好";//设置文字模板,其中#{}表示表达式的起止，#user是表达式字符串，表示引用一个变量。
        String template2 = "#{(1+2)>3 ? 'yes' : 'no'}";
        String template3 = "#{(#os=='02' && #brand=='Samsung')? '5.1' : #version}";
        ExpressionParser paser = new SpelExpressionParser();//创建表达式解析器

        //通过evaluationContext.setVariable可以在上下文中设定变量。
        EvaluationContext context = new StandardEvaluationContext();
        context.setVariable("user","黎明");
        context.setVariable("os","02");
        context.setVariable("brand","Samsung");
        context.setVariable("model","s9+");
        context.setVariable("version","3.0");

        //解析表达式，如果表达式是一个模板表达式，需要为解析传入模板解析器上下文。
        Expression expression = paser.parseExpression(template,new TemplateParserContext());
        Expression expression2 = paser.parseExpression(template2,new TemplateParserContext());
        Expression expression3 = paser.parseExpression(template3,new TemplateParserContext());

        //使用Expression.getValue()获取表达式的值，这里传入了Evalution上下文，第二个参数是类型参数，表示返回值的类型。
        System.out.println(expression.getValue(context,String.class));
        System.out.println(expression2.getValue(context,String.class));
        System.out.println(expression3.getValue(context,String.class));
    }
}
