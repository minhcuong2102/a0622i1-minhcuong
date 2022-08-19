function bai2_1() {
    let luong = parseFloat(prompt("Nhập lương nhân viên: "));
    let thue;

    if (luong >= 15000000){
        thue = 0.2 * luong;
    }else if (7000000 <= luong < 15000000){
        thue = 0.1 * luong;
    }else {
        thue = 0.05 * luong;
    }

    let luongRong = luong - thue;
    alert("Thuế thu nhập là: " + thue + ", tiền lương ròng là: " + luongRong);
}

function bai2_2() {
    let str = prompt("Nhập một chữ cái: ");
    switch (str) {
        case "u":
        case "e":
        case "o":
        case "a":
        case "i":
        case "U":
        case "E":
        case "O":
        case "A":
        case "I":
            alert("Đây là nguyên âm!");
            break;
        default:
            alert("Đây không phải là nguyên âm!");
            break;
    }
}