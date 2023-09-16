package main.java.com.pacoprojects.tibia;

public class DiamondArrow {
    // On full attack max DMG on creature without armor or resistance is:
    // 0.09X(diamond arrow ATK(37)+ATK bow(7 for falcon))X distance skill+lvl/5 and avg is this number devided by 2
    public static void main(String[] args) {
        int[] levels = {200, 500, 639, 1000};
        int[] distanceSkills = {120, 145, 160};
        int diamondArrowAttack = 37;
        int bowAttack = 8;  // soulbleeder

        for (int i = 0; i < levels.length; i++) {
            for (int j = 0; j < distanceSkills.length; j++) {
                printMaxDamage(levels[i], distanceSkills[j], diamondArrowAttack, bowAttack);
            }
        }
    }

    private static double calculateMaxDamage(int level, int distanceSkill, int diamondArrowAttack, int bowAttack) {
        return (0.09 * (diamondArrowAttack + bowAttack) * distanceSkill + ((double)level / 5)) / 2;
    }

    private static void printMaxDamage(int level, int distanceSkill, int diamondArrowAttack, int bowAttack) {
        System.out.println("Level " + level + " and distance skill " + distanceSkill + ". Max DMG on creature without armor or resistance is: " + calculateMaxDamage(level, distanceSkill, diamondArrowAttack, bowAttack) + "");
    }
}
