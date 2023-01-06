import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.addPhone(new FullName("Иван", "Иванов"), "89109907617");
        phonebook.addPhone(new FullName("Александр", "Петров"), "89806886785");
        phonebook.addPhone(new FullName("Илья", "Савинов"), "89106886785");
        phonebook.addPhone(new FullName("Сергей", "Серов"), "89109907515");
        phonebook.addPhone(new FullName("Мария", "Иванова"), "89109987417");
        phonebook.addPhone(new FullName("Ольга", "Петрова"), "89189957647");
        phonebook.addPhone(new FullName("Ирина", "Савинова"), "89149947317");
        phonebook.addPhone(new FullName("Лиза", "Серова"), "89139207327");
        phonebook.addPhone(new FullName("Вика", "Иванова"), "89109927212");
        phonebook.addPhone(new FullName("Марина", "Сергеева"), "89119207312");
        phonebook.addPhone(new FullName("Иван", "Краснов"), "89119927367");
        phonebook.addPhone(new FullName("Михаил", "Михаилов"), "89129304647");
        phonebook.addPhone(new FullName("Лариса", "Иванова"), "89139924657");
        phonebook.addPhone(new FullName("Владимир", "Скворцов"), "89102202627");
        phonebook.addPhone(new FullName("Илья", "Краснов"), "891299017927");
        phonebook.addPhone(new FullName("Павел", "Иванов"), "89106907666");
        phonebook.addPhone(new FullName("Ирина", "Сизова"), "89109937337");
        phonebook.addPhone(new FullName("Мила", "Громова"), "89109945667");
        phonebook.addPhone(new FullName("София", "Ершова"), "89109902237");
        phonebook.addPhone(new FullName("Ксения", "Боева"), "89109901617");

        for (Map.Entry<FullName,String> entry : phonebook.getEntries()){
            System.out.printf("%s -%s%n", entry.getKey(),entry.getValue());
        }

    }

}