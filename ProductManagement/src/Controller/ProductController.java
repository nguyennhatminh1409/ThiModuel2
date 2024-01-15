package Controller;

import java.util.Scanner;

public class ProductController {
    Scanner scanner = new Scanner(System.in);
    ProductController productController = new ProductController();

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        boolean Menu = true;
        while (Menu) {
            System.out.println("Danh sách:");
            System.out.println("1. Hiển thị menu");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Sửa sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("0. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = Scanner.nextInt();

            switch (choice) {
                case 1:
                    Menu = false;
                    System.out.println("Đã chuyển đến trang hiển thị menu");
                    // Thực hiện xử lý hiển thị menu
                    break;
                case 2:
                    scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số
                    System.out.print("Nhập tên sản phẩm: ");
                    String menuName = scanner.nextLine();
                    addMenu(menuName);
                    System.out.println("Sản phẩm đã được thêm thành công");
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Nhập vị trí sản phẩm cần sửa: ");
                    int editIndex = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm mới: ");
                    String newmenuName = scanner.nextLine();
                    editMenu(editIndex, newmenuName);
                    System.out.println("Sản phẩm đã được sửa thành công");
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Nhập vị trí sản phẩm cần xóa: ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine();
                    deleteMenu(deleteIndex);
                    System.out.println("Sản phẩm đã được xóa thành công");
                    break;
                case 0:
                    Menu = false;
                    System.out.println("Đã thoát");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
                    break;
            }
        }
    }

    public void addMenu(String menuName) {
        // Logic to add a menu item
    }

    public void editMenu(int editIndex, String newmenuName) {
        // Logic to edit a menu item
    }

    public void deleteMenu(int deleteIndex) {
        // Logic to delete a menu item
    }

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.Menu();
    }
}