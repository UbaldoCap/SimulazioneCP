import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Workman workman1 = new Workman(0, "Mario Gialli", 0.5F, 20);
        Workman workman2 = new Workman(5, "Gianni Fannulloni", 0.2F, 30);
        Workman workman3 = new Workman(17, "Giorgia Lavoroni", 0.85F, 40);
        ArrayList<Workman> workmanArrayList = new ArrayList<>(Arrays.asList(workman1, workman2, workman3));
        Head head1 = new Head(3, "Alessio Antichi", 0.55F, 20);
        Head head2 = new Head(1, "Marianna Figlidelcapo", 0.3F, 2);
        Head head3 = new Head(9, "Gianluigi Figlidelcapo", 0.3F, 4);
        ArrayList<Head> headArrayList = new ArrayList<>(Arrays.asList(head1, head2, head3));
        for (Workman workman : workmanArrayList) {
            if (workman.canApplyForPromotion()) {
                workman.stampaDettagli();
            }
        }
        for (Head head : headArrayList) {
            if (head.mayBeDemoted()) {
                head.stampaDettagli();
            }
        }
        ArrayList<Employee> employeeArrayList = new ArrayList<>(headArrayList);
        employeeArrayList.addAll(workmanArrayList);
        Map<String, Float> nameEffMap = new HashMap<>();
        for (Employee employee : employeeArrayList) {
            nameEffMap.put(employee.getName(), employee.getEfficiencyIndex());
        }
        System.out.println(" ");
        for (Map.Entry<String, Float> entry : nameEffMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println(" ");
        for (Employee employee : employeeArrayList) {
            System.out.println(employee.getName() + " " + employee.getEfficiencyIndex());
        }
        System.out.println("Optinal 1");
        for (Employee employee : employeeArrayList) {
            StringBuilder stringBuilderend = new StringBuilder();
            StringBuilder stringBuilder = new StringBuilder(employee.getName());
            for (int index = 0; index < stringBuilder.length(); index++) {
                char character = stringBuilder.charAt(index);
                if (Character.isUpperCase(character)) {
                } else {
                    stringBuilderend.append(character);
                }
            }
            System.out.println(stringBuilderend);
        }
        System.out.println("Optinal 2");
        for (Employee employee : employeeArrayList) {
            StringBuilder stringBuilderend = new StringBuilder();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(employee.getEfficiencyIndex()));
            for (int index = 0; index < stringBuilder.length(); index++) {
                char character = stringBuilder.charAt(index);
                if (Character.isDigit(character)) {
                    stringBuilderend.append("?");
                } else if (character == '.') {
                    stringBuilderend.append(',');
                } else {
                    stringBuilderend.append(stringBuilder.charAt(index));
                }
            }
            System.out.println(stringBuilderend);
        }
    }
}
