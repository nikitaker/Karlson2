public class Main {
    public static void main(String[] args) {
        Karlson karlson = new Karlson();
        Hero bok = new Hero();
        Hero julius = new Hero();
        Hero malish = new Hero();
        try {
            malish.setName("Малыш");
            bok.setName("Freckin Bock");
            julius.setName("");
        }
        catch (NoNameException e){
            System.out.println("Перехвачено " + e);
        }
        karlson.dress();
        malish.isSeen(karlson);
        malish.go("кухня");
        malish.see("странную фигуру");
        karlson.state();
        karlson.fly("комната Боссы");
        karlson.isSeen(malish);
        karlson.fly("гостинная");
        bok.isSeen(karlson);
        julius.isSeen(karlson);
        bok.talk(julius);
        karlson.scream();
        karlson.fly("Малыш");
        karlson.undress();
        karlson.dissapoint("он ожидал, что Малыш от удивления упадет в обморок");

        karlson.talk(malish);


    }
}
