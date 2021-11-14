package by.introduction.first.leaner1.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 3. Stings and basics of text processing

   Работа с регулярными выражениями (Pattern, Matcher)

2.	Дана строка, содержащая следующий текст (xml-документ):
	<notes>
	<note id = "1">
	<to>Вася</to>
	<from>Света</from>
	<heading>Напоминание</heading>
	<body>Позвони мне завтра!</body>
	</note>
	<note id = "2">
	<to>Петя</to>
	<from>Маша</from>
	<heading>Важное напоминание</heading>
	<body/>
	</note>
	</notes>
	Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа 
	и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела). 
	Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */
public class Solution87 {
    public static void main(String[] args) {
        System.out.println("xml document: \n");

        String xmlDocument = "<notes>\n" +
                "  <note id = \"1\">\n" +
                "    <to>Vasia</to>\n" +
                "    <from>Sveta</from>\n" +
                "    <heading>Reminder</heading>\n" +
                "    <body>Call me tomorrow!</body>\n" +
                "  </note>\n" +
                "  <note id = \"2\">\n" +
                "    <to>Petya</to>\n" +
                "    <from>Masha</from>\n" +
                "    <heading>Important remainder</heading>\n" +
                "    <body/>\n" +
                "  </note>\n" +
                "</notes> ";
        System.out.println(xmlDocument + "\n");
        xmlParse(xmlDocument);

    }

    static void xmlParse(String xmlDocument) {
        String regex = "<\\/?\\w+.+>?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(xmlDocument);

        System.out.println("Our analyzer: " + "\n");

        while (matcher.find()) {

            String firstTag = matcher.group();

            Pattern patternOpeningTag = Pattern.compile("<\\w+>");
            Matcher matcherOpeningTag = patternOpeningTag.matcher(firstTag);

            while (matcherOpeningTag.find()) {
                System.out.print("Opening tag: " + matcherOpeningTag.group() + ", ");
            }

            Pattern patternOpeningTagWithAttributes = Pattern.compile("<\\w+ .+>");
            Matcher matcherOpeningTagWithAttributes = patternOpeningTagWithAttributes.matcher(firstTag);

            while (matcherOpeningTagWithAttributes.find()) {
                System.out.print("Opening tag with attributes: " + matcherOpeningTagWithAttributes.group() + ", ");
            }

            Pattern patternContent = Pattern.compile(">.+<");
            Matcher matcherContent = patternContent.matcher(firstTag);

            while (matcherContent.find()) {
                String content = matcherContent.group();
                String regex2 = "[<>]";
                content = content.replaceAll(regex2, "");

                System.out.print("Content of this tag: " + content + ", ");

            }

            Pattern patternTagOfEmptyElement = Pattern.compile("<\\w+\\s?/>");
            Matcher matcherTagOfEmptyElement = patternTagOfEmptyElement.matcher(firstTag);

            while (matcherTagOfEmptyElement.find()) {

                System.out.print("Tag of empty element: " + matcherTagOfEmptyElement.group() + ". ");
            }

            Pattern patternClosingTag = Pattern.compile("<\\/\\w+>");
            Matcher matcherClosingTag = patternClosingTag.matcher(firstTag);

            while (matcherClosingTag.find()) {

                System.out.print("Closing tag: " + matcherClosingTag.group() + ". ");
            }
            System.out.println(" ");
        }
    }
}