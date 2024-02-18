package view;

import model.CountModel;

import java.util.Scanner;

public class InputView {
    CountModel countModel = new CountModel();

    public void inputDate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to get all products or only one? \n"
                + " If you want get all products, type '1' \n"
                + " If you want get one product, type '2'");
        String inputDate = scanner.nextLine();
        switch (inputDate) {
            case "1" -> countModel.getOutput(countModel.getData());
            case "2" -> countModel.getId();
        }
    }
}
