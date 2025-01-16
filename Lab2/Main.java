import model.Paragraph;
import model.Section;
import services.AllignLeft;
import services.AllignRight;
import services.CenterStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        System.out.println("Printing without Alignment");
        System.out.println();
        cap1.print();
        p1.render(new AllignLeft(20));
        p2.render(new AllignRight(20));
        p3.render(new CenterStrategy(20));

        System.out.println();
        System.out.println("Printing with Alignment");
        System.out.println();
        cap1.print();
    }
}