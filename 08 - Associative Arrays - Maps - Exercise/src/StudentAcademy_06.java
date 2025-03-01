import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, List<Double>> studentsAndGrades = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            //проверявам дали имам студент с това име
            if (studentsAndGrades.containsKey(name)) {
                studentsAndGrades.get(name).add(grade);
            } else {
                List<Double> grades = new ArrayList<>();
                grades.add(grade);
                studentsAndGrades.put(name, grades);
            }
        }

        for (Map.Entry<String, List<Double>> entry : studentsAndGrades.entrySet()) {

            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            //Option 1
            double sum = grades.stream().mapToDouble(Double::doubleValue).sum();

           /* //Option 2
            double sum = 0;
            for (Double grade : grades) {
                sum += grade;
            }
*/
            double avgGrade = sum / grades.size();
            if (avgGrade >= 4.5) {
                System.out.printf("%s -> %.2f%n", studentName, avgGrade);
            }
        }

        /*studentsAndGrades.entrySet()
                .stream().filter( entry -> {
                    double grades = entry.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .sum();
                    return grades / entry.getValue().size() >= 4.5;
                })
                .forEach(entry -> {
                    double grades = entry.getValue().stream()
                            .mapToDouble(Double::doubleValue)
                            .sum();
                    System.out.printf("%s -> %.2f%n", entry.getKey(), grades / entry.getValue().size());
                });*/
    }
}
