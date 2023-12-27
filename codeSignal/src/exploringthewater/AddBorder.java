package exploringthewater;

public class AddBorder {
    //Mô tả: tạo khung tranh có độ lớn bằng mảng + 2, duyệt khung tranh, trừ đầu và cuối,
    // các phần từ còn lại sẽ là * + tranh + *.
    //Phần còn lại sẽ bằng tranh bất kì thay hết các kí tự thành *
    String[] improveSolution(String[] picture) {
        String[] framedPicture = new String[picture.length + 2];

        for(int i = 0 ; i < picture.length ; i++) {
            framedPicture[i+1] = '*' + picture[i] + '*';
        }

        framedPicture[0] = framedPicture[picture.length + 1] = framedPicture[1].replaceAll(".","*");

        return framedPicture;
    }
}
