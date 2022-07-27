function bai_1() {
    function Fibonacci(n) {
        if (n === 1 || n === 2){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }
    let num = prompt("Nhập số lượng số Fibonacci cần hiển thị: ");
    for (let i = 1; i <= num; i++){
        document.write(Fibonacci(i) + '<br>');
    }
}

function bai_2() {
    let giaiThua = 1;
    let n = Number(prompt("Nhập một số: "));
    while (n <= 0){
        alert("Số phải là nguyên dương!");
        n = Number(prompt("Nhập lại số nguyên dương: "));
    }
    for (let i = 1; i <= n; i++){
        giaiThua *= i;
    }
    alert("Giai thừa của số đã chọn là: "+ giaiThua);
}

function bai_3() {
    let chieuCao = Number(prompt("Nhập chiêu cao: "));
    while (chieuCao <= 0){
        alert("Số phải là nguyên dương!");
        chieuCao = Number(prompt("Nhập lại chiều cao: "));
    }
    let kieuDang = Number(prompt("Nhập kiểu dáng: 1. Vuông góc dưới bên trái, 2. Vuông góc trên bên trái, 3. Vuông góc dưới bên phải, 4. Vuông góc trên bên phải."));
    switch (kieuDang) {
        case 1:
            for (let i = 1; i <= chieuCao; i++){
                    for (j = 1; j <= i; j++){
                        document.write(' * ');
                    }
                    document.write("<br>");
                }
            break;

        case 2:
            for (let i = chieuCao; i >= 1; i--){
                for (let j = 1; j <= i; j++){
                    document.write(" * ")
                }
                document.write("<br>");
            }
            break;

        case 3:
            for (let i = 1; i <= chieuCao; i++){
                    for (let j = 1; j <= chieuCao; j++){
                        if (j <= chieuCao - i){
                            document.write("&nbsp&nbsp");
                        }else {
                            document.write("*");
                        }
                    }
                    document.write("<br>");
                }
            break;

        case 4:
            for (let i = chieuCao; i >= 1; i--){
                for (let j = 1; j <= chieuCao; j++){
                    if (j <= chieuCao - i){
                        document.write("&nbsp&nbsp");
                    }else {
                        document.write("*")
                    }
                }
                document.write('<br>');
            }
            break;
    }
}

function bai_4() {
    let chieuDai = Number(prompt("Nhập chiều dài: "));
    let chieuRong = Number(prompt("Nhập chiều rộng: "));
    while (chieuDai <= 0 || chieuRong <= 0){
        alert("Chiều dài hoặc chiều rộng phải lớn hơn 0!");
        chieuDai = Number(prompt("Nhập lại chiều dài: "));
        chieuRong = Number(prompt("Nhập lại chiều rộng: "));
    }
    for (let i = 1; i <= chieuRong; i++){
        for (let j = 1; j <= chieuDai; j++){
            if (i === 1 || j === 1 || i === chieuRong || j === chieuDai){
                document.write("*");
            }else {
                document.write("&nbsp&nbsp");
            }
        }
        document.write("<br>");
    }
}

function bai_5() {
    let tienVon = parseFloat(prompt("Nhập số tiền vốn: "));
    let soThang = parseFloat(prompt("Nhập số tháng cho vay: "));
    let laiSuat = parseFloat(prompt("Nhập lãi suất hàng tháng: "));
    let tongTien = tienVon;
    for (let i = 1; i <= soThang; i++){
        tongTien *= (1 + laiSuat);
    }
    let tienLai = tongTien - tienVon;
    alert("Số tiền lãi là: " + tienLai.toFixed(0));
}

function bai_6() {
    for (let i = 1; i < 7; i++){
        for (let j = 1; j <= 7; j++){
            if (!((i === 1 &&(j === 1 || j === 4 || j === 7))
            || (i === 4 && (j === 1 || j === 7))
            || (i === 5 && (j <= 2 || j >= 6))
            || (i === 6 && (j <= 3 || j >= 5)))){
                document.write(" * ");
            }else {
                document.write("&nbsp&nbsp");
            }
        }
        document.write("<br>");
    }
}