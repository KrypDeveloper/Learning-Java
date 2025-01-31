public class await {
    public static void main(String[] args) {
        boolean loop = true;
        int count = 0;

        do {
            if (count < 5) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException error) { // i hate this for some reason lol
                    System.out.println("OOF: " + error.getMessage());
                };
                System.out.println("Wait 1 second current count: " + count);
                count++;
            } else {
                loop = false;
                System.out.println("Loop finished");
            };
        } while (loop);
    };
}
