public class GymWeightLoss {

        public static void main(String[] args) {

                    String[] gyms = {"GYM 1", "GYM 2", "GYM 3"};
                    String[] months = {"MONTH 1", "MONTH 2", "MONTH 3"};

                    int[][] weightLoss = {{10, 20, 27}, {22, 5, 20}, {30, 20, 10}};

                    System.out.println("GYM WEIGHT-LOSS APPLICATION");
                    System.out.println("-------------------------------------------------------------------------------------------");
                    System.out.printf("%-8s %-10s %-10s %-10s %-10s %-12s %-10s %-10s%n", "GYM", months[0], months[1], months[2], "TOTAL", "AVERAGE", "MAX", "MIN");
                    System.out.println("-------------------------------------------------------------------------------------------");

                    for (int i = 0; i < weightLoss.length; i++) {
                        int total = 0;
                        int max = weightLoss[i][0];
                        int min = weightLoss[i][0];

                        for (int j = 0; j < weightLoss[i].length; j++) {
                            total += weightLoss[i][j];
                            if (weightLoss[i][j] > max) max = weightLoss[i][j];
                            if (weightLoss[i][j] < min) min = weightLoss[i][j];
                        }

                        double average = total / 3.0;

                        System.out.printf("%-8s %-10s %-10s %-10s %-10s %-12s %-10s %-10s%n", gyms[i],
                                weightLoss[i][0] + "kg",
                                weightLoss[i][1] + "kg",
                                weightLoss[i][2] + "kg",
                                total + "kg",
                                String.format("%.2fkg", average),
                                max + "kg",
                                min + "kg");
                    }

                    System.out.println("-------------------------------------------------------------------------------------------");
                }
            }