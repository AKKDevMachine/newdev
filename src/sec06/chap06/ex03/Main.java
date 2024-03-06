package sec06.chap06.ex03;

public class Main {
    public static void main(String[] args) {
        YalcoChickenMenu menu1 = YalcoChickenMenu.YN;
        YalcoChickenMenu menu2 = YalcoChickenMenu.RS;
        YalcoChickenMenu menu3 = YalcoChickenMenu.XX;

        var menu1Name = menu1.getName();
        var menu2Price = menu2.getPrice();
        var menu1Desc = menu1.getDesc();

        menu2.setPrice(16000);
        var menu2NewPrice=menu2.getPrice();

        var byNames = new YalcoChickenMenu[]{
                YalcoChickenMenu.valueOf("FR"),
                YalcoChickenMenu.valueOf("PP"),
                YalcoChickenMenu.valueOf("GJ"),
        };
        for(var byName : byNames){
            System.out.println(byName);
        }

        var names = new String[]{
                menu1.name(), menu2.name(), menu3.name()
        };
        var orders = new int[]{
                menu1.ordinal(), menu2.ordinal(), menu3.ordinal()
        };
        var menus = YalcoChickenMenu.values();

        for(var menu : menus){
            System.out.println(menu.getDesc());
        }

        System.out.println("\n------------\n");

        YalcoChicken store1 = new YalcoChicken();
        for(var menuName : "양념치킨,능이백숙,땡초치킨".split(",")){
            store1.takeOrder(menuName);
        }

    }
}
