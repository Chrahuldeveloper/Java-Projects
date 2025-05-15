import java.util.ArrayList;

class Soultion1 {
    public static void main(String[] args) {

        int nums[] = { -4, -3, -2, -1, 4, 3, 2 };

        ArrayList<Integer> netGains = new ArrayList<>();
        int sum = 0;
        netGains.add(sum);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            netGains.add(sum);
        }

        int maxGain = netGains.get(0);

        for (int i = 0; i < netGains.size(); i++) {
            if (netGains.get(i) > maxGain) {
                maxGain = netGains.get(i);
            }
        }

        System.out.println(maxGain);

    }
}