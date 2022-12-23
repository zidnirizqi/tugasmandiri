import java.util.ArrayList;

public class BisKota {

        public static void main(String[] args) {
            ArrayList<int[]> StopGo = new ArrayList<int[]>();
            //array pertama orang naik bus, arrray kedua orang turun
            StopGo.add(new int[] {10,0});
            StopGo.add(new int[] {3,5});
            StopGo.add(new int[] {2,5});
            System.out.println(getPassenger(StopGo));
        }

        public static int getPassenger(ArrayList<int []> BisKota) {
            return BisKota.get(0)[0]- BisKota.get(0)[1]+BisKota.get(1)[0]-BisKota.get(1)[1]+BisKota.get(2)[0]-BisKota.get(2)[1];

        }
    }



