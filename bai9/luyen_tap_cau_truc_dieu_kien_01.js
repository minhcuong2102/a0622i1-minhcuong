function bai1() {
    let a = parseInt(prompt("Nhập a: ")),
        b = parseInt(prompt("Nhập b: "));
    if (a % b === 0) {
        alert("a chia hết cho b!");
    } else {
        alert("a không chia hết cho b!")
    }
}

function bai2() {
    let tuoi = parseInt(prompt("Nhập số tuổi: "));
    if (tuoi < 16){
        alert("Không đủ tuổi vào lớp 10!");
    }
    else {
        alert("Đủ tuổi vào lớp 10!");
    }
}

function bai3() {
    let num1 = parseInt(prompt("Nhập số nguyên: "));
    if (num1 > 0){
        alert(num1 + "lớn hơn 0!");
    }
    else {
        alert(num1 + "nhỏ hơn 0!");
    }
}

function bai4() {
    let a = parseInt(prompt("Nhập a: ")),
        b = parseInt(prompt("Nhập b: ")),
        c = parseInt(prompt("Nhập c: "));
    let max = a;
    if (max > b && max > c){

    }
    else if (b > c){
        max = b;
    }
    else {
        max = c;
    }
    alert(max + "là số lớn nhất!");
}

function bai5() {
    let kiemtra = parseInt(prompt("Nhập điểm kiểm tra: ")),
        giuaki = parseInt(prompt("Nhập điểm giữa kì: ")),
        cuoiki = parseInt(prompt("Nhập điểm cuối kì: "));
    let dtb = (kiemtra + giuaki*2 + cuoiki*3)/6;
    if (dtb >= 8){
        alert("Học lực giỏi!");
    }
    else if (6.5 <= dtb < 8){
        alert("Học lực khá!");
    }
    else if (5 <= dtb < 6.5){
        alert("Học lực trung bình!");
    }
    else {
        alert("Học lực kém!");
    }
}

function bai6() {
    let doanhso = parseInt(prompt("Nhập doanh số: "));
    let hoahong = 0;
    if (doanhso < 100000){
        hoahong = doanhso/100;
    }
    else if (100000 <= doanhso < 500000){
        hoahong = doanhso/20;
    }
    else if (500000 <= doanhso < 1000000){
        hoahong = doanhso/10;
    }
    else{
        hoahong = doanhso*0.15;
    }
    alert("Tiền hoa hồng là: " + hoahong);
}

function bai7() {
    let bandau = parseInt(prompt("Nhập tiền cước 1 phút đầu: ")),
        moigiay = parseInt(prompt("Nhập tiền cước mỗi giây: ")),
        thoigian = parseInt(prompt("Nhập thời gian gọi: ")),
        tongcong;
    if (thoigian <= 60){
        tongcong = bandau;
    }
    else {
        tongcong = bandau + moigiay*(thoigian - 60);
    }
    alert("Tổng tiền cước là: " + tongcong);
}