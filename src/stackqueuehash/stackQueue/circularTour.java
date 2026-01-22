package stackqueuehash.stackQueue;

public class circularTour {

    static int start(int[] pet, int[] dist) {
        int bal = 0, need = 0, s = 0;

        for (int i = 0; i < pet.length; i++) {
            bal += pet[i] - dist[i];
            if (bal < 0) {
                need += bal;
                bal = 0;
                s = i + 1;
            }
        }
        return bal + need >= 0 ? s : -1;
    }

    public static void main(String[] args) {
        int[] pet = {4, 6, 7, 4};
        int[] dist = {6, 5, 3, 5};

        int res = start(pet, dist);
        System.out.println(res);
    }
}
