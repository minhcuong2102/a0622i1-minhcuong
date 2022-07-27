function bai1() {
    for (let i = 1; i <= 100; i++) {
        document.write(i + '<br>');
        if (i === 99){
            alert("Đã hoàn thành");
        }
    }
}

function bai2() {
    let nhietDo = prompt("Nhập nhiệt độ: ");
    while (nhietDo < 20 || nhietDo > 100){
        if (nhietDo < 20){
            nhietDo = prompt("Tăng nhiệt độ!");
        }
        if (nhietDo > 100){
            nhietDo = prompt("Giảm nhiệt độ!");
        }
    }
}

function bai3() {
    function fibonacci(n) {
        if (n === 1 || n === 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    let num = prompt("Nhập số lượng số Fibonacci cần hiển thị: ");
    for (let i = 1; i <= num; i++){
        document.write(fibonacci(i) + '<br>');
    }
}

function bai4() {
    function fibonacci(n) {
        if (n === 1 || n === 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    let i = 1;
    while (fibonacci(i)){
        if(fibonacci(i) % 5 === 0){
            document.write(fibonacci(i));
            break;
        } else {
            i++;
        }
    }
}

function bai5() {
    function fibonacci(n) {
        if (n === 1 || n === 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    let tong = 0;
    for (let i = 1; i <= 20; i++){
        tong += fibonacci(i);
    }
    alert(tong);
}

function bai6() {
    let tong = 0;
    let cnt = 0;
    let i = 1;
    while (cnt < 30) {
        if (i % 7 === 0) {
            tong += i;
            cnt++;
        }
        i++;
    }
    alert(tong);
}

function bai7() {
    for (let i = 1; i <= 100; i++) {
        if (i % 15 === 0) {
            document.write("FizzBuzz" + '<br>');
        }else {
            if (i % 3 === 0) {
            document.write("Fizz" + '<br>');
            } else if (i % 5 === 0) {
            document.write("Buzz" + '<br>');
        }
        else {
            document.write(i + '<br>');
            }
        }
    }
}

function bai8() {
    let khoangSo = Number(prompt("Nhập khoảng số muốn đoán: "));
    let nhapSo = Number(prompt("Nhập số: "));
    let soNgauNhien;
    if(khoangSo){
        soNgauNhien = Math.floor(Math.random() * khoangSo);
        if(soNgauNhien === nhapSo){
            alert("Bạn đã đoán đúng!");
        }else {
            while (soNgauNhien !== nhapSo){
                alert("Bạn đã đoán sai, số chính xác là: " + soNgauNhien);
                nhapSo = Number(prompt("Nhập số lại: "))
            }
            alert("Bạn đã đoán đúng!");
        }
    }
}