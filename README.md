# SI_2024_lab2_223034
Ема Ристовска 223034

Control Flow Graph

![Control Flow Graph](https://github.com/EmaRistovska/SI_2024_lab2_223034/assets/139145050/72db3a58-d627-4a20-80d0-1f704722b079)

Цикломатска комплексност

Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10.

Тест случаи според критериумот Every Branch

allItems = [], payment = 0  //allItems list can't be null
Item("Книга", null, 150, 5.0)], payment = 80  //No barcode
Item("Фладер", "9876", 80, 0.0)], payment = 80  //true
Item("Папка", "0123", 300, 15.0)], payment = 200  //true
Item("", "1234", 200, 10.0)], payment = 100  //false

Тест случаи според критериумот Multiple Condition

T && T && T
item.getPrice() >= 300, item.getDiscount() > 0, item.getBarcode().charAt(0) == '0'
T && T && F
item.getPrice() >= 300, item.getDiscount() > 0, item.getBarcode().charAt(0) != '0'
T && F && T
item.getPrice() >= 300, item.getDiscount() <= 0, item.getBarcode().charAt(0) == '0'
T && F && F
item.getPrice() >= 300, item.getDiscount() <= 0, item.getBarcode().charAt(0) != '0'
F && T && T
item.getPrice() < 300, item.getDiscount() > 0, item.getBarcode().charAt(0) == '0'
F && T && F
item.getPrice() < 300, item.getDiscount() > 0, item.getBarcode().charAt(0) != '0'
F && F && T
item.getPrice() < 300, item.getDiscount() <= 0, item.getBarcode().charAt(0) == '0'
F && F && F
item.getPrice() < 300, item.getDiscount() <= 0, item.getBarcode().charAt(0) != '0'






