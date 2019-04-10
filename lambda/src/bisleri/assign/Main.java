package bisleri.assign;

public class Main {
    public static void main(String[] a) {
        /*BisleriBottle smallBottle = () -> new BisleriInfo(8, 173);
        BisleriBottle mediumBottle = () -> new BisleriInfo(13, 500);
        BisleriBottle largeBottle = () -> new BisleriInfo(18, 1000);
*/
        BisleriPack packs[] = new BisleriPack[3];
        packs[0] = new BisleriPack(1, () -> new BisleriInfo(8, 200), 20);
        packs[1] = new BisleriPack(2, () -> new BisleriInfo(13, 500), 10);
        packs[2] = new BisleriPack(3, () -> new BisleriInfo(18, 1000), 10);

        BisleriDataProcessor volumeProcessor = n -> {
            float volume = 0.0f;
            for (BisleriPack pack : n) {
                volume = volume + (pack.getQuantity() * pack.getBottleType().getBisleriInfo().getVolume());
            }
            return volume/1000;
        };
        BisleriDataProcessor costProcessor = (n) -> {
            float price = 0.0f;
            for (BisleriPack pack : n) {
                price = price + (pack.getQuantity() * pack.getBottleType().getBisleriInfo().getPrice());
            }
            return price;
        };

        System.out.println(volumeProcessor.processBisleriData(packs)+" Liters");
        System.out.println(costProcessor.processBisleriData(packs));
    }
}
