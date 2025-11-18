import java.util.ArrayList;
import java.util.HashMap;

void main() {
    ArrayList<Integer> dailySteps = new ArrayList<>();
    dailySteps.add(12000);
    dailySteps.add(8500);
    dailySteps.add(15000);
    dailySteps.add(9200);
    dailySteps.add(18000);
    dailySteps.add(7800);
    dailySteps.add(11000);

    HashMap<String, Integer> goals = new HashMap<>();
    goals.put("dailyGoal", 10000);
    goals.put("weeklyGoal", 70000);
    goals.put("minSteps", 8000);

    int totalSteps = 0;
    int maxSteps = 0;
    int minStepsValue = 0;
    double averageSteps = 0;

    for (int steps : dailySteps) {
        totalSteps += steps;
    }
    System.out.println("Total steps: " + totalSteps);

    maxSteps = dailySteps.get(0);
    for (int steps : dailySteps) {
        if (steps > maxSteps) {
            maxSteps = steps;
        }
    }

    System.out.println("Maximum: " + maxSteps);

    minStepsValue = dailySteps.get(0);
    for (int steps : dailySteps) {
        if (steps < minStepsValue) {
            minStepsValue = steps;
        }
    }

    System.out.println("Maximum: " + minStepsValue);

    averageSteps = (double) totalSteps / dailySteps.size();

    System.out.printf("Average value: %.2f%n", averageSteps);

    int daysGoalAchieved = 0;

    for (int days : dailySteps) {
        if (days >= goals.get("dailyGoal")) {
            daysGoalAchieved++;
        }
    }
    System.out.println("Дневная норма дней: " + daysGoalAchieved);

    ArrayList<Integer> bestDays = new ArrayList<>();

    /*for (int days : dailySteps) {
        if (days >= goals.get("dailyGoal")) {
            bestDays.add(days);
        }
    }
    System.out.println("Дни выше цели: " + bestDays);*/

    boolean hasLazyDays = false;

    for (int steps : dailySteps) {
        if (steps < goals.get("minSteps")) {
            hasLazyDays = true;
        }
    }

    System.out.println("Есть ли дни без минимала? " + hasLazyDays);

}