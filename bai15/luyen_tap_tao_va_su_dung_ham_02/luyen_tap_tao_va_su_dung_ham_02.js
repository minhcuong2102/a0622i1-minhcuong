function bai01() {
    function binhPhuong() {
        let a = parseFloat(prompt("Nhập số: "));
        return alert("Bình phương của số " + a + " là: " + a * a);
    }
    binhPhuong();
}

function bai02() {
    function dienTich() {
        return alert("Diện tích hình tròn là: " + (r * r * 3.14).toFixed(3));
    }
    function chuVi() {
        return alert("Chu vi hình tròn là: " + (r * 6.28).toFixed(3));
    }
    let r = prompt("Nhập bán kính: ");
    dienTich();
    chuVi();

}

function bai03() {
    function giaiThua(n) {
        if (n > 0){
            return n * giaiThua(n-1);
        }else {
            return 1;
        }
    }
    let num = prompt("Nhập số cần tính giai thừa: ");
    alert("Giá trị của " + num + "! là: " + giaiThua(num));
}

function bai04() {
    function kiTuSo() {
        if (Number(a) == a){
            alert("Đây là kí tự số!");
        }else {
            alert("Đây không phải là kí tự số!");
        }
    }
    let a = prompt("Nhập một kí tự: ");
    kiTuSo(a);
}

function bai05() {
    function soNhoNhat(){
        let min = a;
        if (b < min && b < c){
            min = b;
        }else {
            min = c;
        }
        alert(min + " là số nhỏ nhất!");
    }
    let a = prompt("Nhập số a: ");
    let b = prompt("Nhập số b: ");
    let c = prompt("Nhập số c: ");
    soNhoNhat(a, b, c);
}

function bai06() {
    function soNguyenDuong() {
        if (n > 0){
            alert("Đây là số nguyên dương!");
        }else if (n === 0){
            alert("Đây là số 0!");
        }else {
            alert("Đây là số nguyên âm!");
        }
    }
    let n = Number(prompt("Nhập số nguyên: "));
    soNguyenDuong();
}

function bai07() {
    function swap() {
        let tmp = a;
        a = b;
        b = tmp;
        alert("a = " + a + ", b = " + b);
    }
    let a = prompt("Nhập số a: ");
    let b = prompt("Nhập số b: ");
    swap();
}

function bai08() {
    function daoNguoc() {
        for (let i = 0; i < soPhanTu; i++){
            arr.push(prompt("Nhập phần tử thứ " + (i+1) + ":"));
        }
        let first = 0;
        let last = arr.length - 1;
        while (first < last){
            let tmp = arr[first];
            arr[first] = arr[last];
            arr[last] = tmp;
            first++;
            last--;
        }
        alert("Mảng đã đảo ngược là: " + arr.join(", "));
    }
    let arr = [];
    let soPhanTu = prompt("Nhập số phần tử: ");
    daoNguoc();
}

function bai09() {
    function trongMang() {
        let cnt = 0;
        for (let i = 0; i < string.length; i++){
            arr[i] = string.charAt(i);
        }
        console.log(arr);
        for (let i = 0; i < arr.length; i++) {
            if (arr[i] === a) {
                cnt++;
            }
        }
        if (cnt === 0){
            return console.log(-1);
        }else {
            return alert("Số lần xuất hiện là: " + cnt);
        }
    }
    let arr = [];
    let string = prompt("Nhập chuỗi kí tự: ");
    let a = prompt("Nhập kí tự cần tìm: ");
    trongMang();
}