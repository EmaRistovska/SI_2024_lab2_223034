# SI_2024_lab2_223034
Ема Ристовска 223034

Control Flow Graph

![Control Flow Graph](https://github.com/EmaRistovska/SI_2024_lab2_223034/assets/139145050/72db3a58-d627-4a20-80d0-1f704722b079)

Цикломатска комплексност

Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=9, па цикломатската комплексност изнесува 10.

Тест случаи според критериумот Every Branch

allItems = [], payment = 0  --> празна листа, ќе врати "allItems list can't be null"

Item("Item1", null, 150, 5.0)], payment = 80  --> Нема баркод како аргумент, ќе врати "No barcode"

Item("Item2", "9876", 80, 0.0)], payment = 80  --> Ќе врати true

Item("Item3", "0123", 300, 15.0)], payment = 200  --> Ќе врати true

Item("", "1234", 200, 10.0)], payment = 100  --> Нема име како аргумент, ќе врати false

Тест случаи според критериумот Multiple Condition

За условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')

T && T && T
item.getPrice() >= 300, item.getDiscount() > 0, item.getBarcode().charAt(0) == '0'  --> Исполнети се сите три услови 

T && T && F
item.getPrice() >= 300, item.getDiscount() > 0, item.getBarcode().charAt(0) != '0'  --> Исполнети се само првите два услови

T && F && T
item.getPrice() >= 300, item.getDiscount() <= 0, item.getBarcode().charAt(0) == '0'  --> Исполнети се само првиот и третиот услов

T && F && F
item.getPrice() >= 300, item.getDiscount() <= 0, item.getBarcode().charAt(0) != '0'  --> Исполнет е само првиот услов

F && T && T
item.getPrice() < 300, item.getDiscount() > 0, item.getBarcode().charAt(0) == '0'  --> Исполнети се само вториот и третиот услов

F && T && F
item.getPrice() < 300, item.getDiscount() > 0, item.getBarcode().charAt(0) != '0'  --> Исполнет е само вториот услов

F && F && T
item.getPrice() < 300, item.getDiscount() <= 0, item.getBarcode().charAt(0) == '0' --> Исполнет е само третиот услов

F && F && F
item.getPrice() < 300, item.getDiscount() <= 0, item.getBarcode().charAt(0) != '0' --> Не е исполнет ниту еден услов




