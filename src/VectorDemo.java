import java.util.*;

public class VectorDemo {
    public static void main(String args[]) {
        // начальный размер 3, шаг 2
        VectorLib v = new VectorLib(3, 2);
        System.out.println("Начальный размер: " + v.size());
        System.out.println("Начальная ёмкость: " + v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);
        System.out.println("Ёмкость после четырёх сложений: " + v.capacity());

        v.addElement(5.45);
        System.out.println("Текущая ёмкость: " + v.capacity());

        v.addElement(6.08);
        v.addElement(7);
        System.out.println("Текущая ёмкость: " + v.capacity());

        v.addElement((float) 9.4);
        v.addElement(10);
        System.out.println("Текущая ёмкость: " + v.capacity());

        v.addElement(11);
        v.addElement(12);
        System.out.println("Первый элемент: " +  v.firstElement());
        System.out.println("Последний элемент: " + v.lastElement());

        if (v.contains(3))
            System.out.println("Вектор содержит 3.");

        // перечислить элементы в векторе.
        Enumeration vEnum = v.elements();
        System.out.println("Элементы в векторе:");

        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();

        v.removeElementAt(5);
        vEnum = v.elements();
        System.out.println("Элементы в векторе после удаления элемента с индексом 5:");

        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();
    }
}
