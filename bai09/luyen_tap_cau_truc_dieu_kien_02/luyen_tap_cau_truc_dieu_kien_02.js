function bai01() {
    let doC = parseInt(prompt("Nhập độ C: "));
    let doF = doC * 9/5 + 32;
    alert("Độ F là: " + doF);
}

function bai02() {
    let m = parseInt(prompt("Nhập độ dài bằng mét: "));
    let ft = m * 3.2808;
    alert("ĐỘ dài bằng feet là: " + ft);
}

function bai03() {
    let a = parseInt(prompt("Nhập cạnh hình vuông: "));
    let S = a*a;
    alert("Diện tích hình vuông là: " + S);
}

function bai04() {
    let a = parseInt(prompt("Nhập cạnh a: ")),
        b = parseInt(prompt("Nhập cạnh b: "));
    let S = a*b;
    alert("Diện tích hình chữ nhật là: "+ S);
}

function bai05() {
    let a = parseInt(prompt("Nhập cạnh a: ")),
        b = parseInt(prompt("Nhập cạnh b: "));
    let S = a*b/2;
    alert("Diện tích hình tam giác vuông là: "+ S);
}

function bai06() {
    let a = parseInt(prompt("Nhập số a: ")),
        b = parseInt(prompt("Nhập số b: "));
    if (a === 0){
        if (b === 0){
            alert("Phương trình có vô số nguyên!");
        }
        else {
            alert("Phương trình vô nghiệm!");
        }
    }
    else {
        alert("Nghiệm của phương trình này là x = " + -b/a);
    }
}

function bai07() {
    let a = parseInt(prompt("Nhập số a: ")),
        b = parseInt(prompt("Nhập số b: ")),
        c = parseInt(prompt("Nhập số c: "));
    if (a === 0){
        alert("Đây không phải phương trình bậc 2!");
    }
    else{
        let delta = b*b - 4*a*c;
        if(delta < 0){
            alert("Phương trình vô nghiệm!");
        }
        else if(delta === 0){
            alert("Phương trình có nghiệm kép x = : " + -b/2*a);
        }
        else {
            let x1 = (-b + Math.sqrt(delta))/(2*a),
                x2 = (-b - Math.sqrt(delta))/(2*a);
            alert("Phương trình có 2 nghiệm phân biệt x1 = " + x1.toFixed(3) + ", x2 = " + x2.toFixed(3));
        }
    }
}

function bai08() {
    let age = parseInt(prompt("Nhập một số: "));
    if (0 < age < 120){
        alert(age + " là tuổi của một người!");
    }
    else {
        alert(age + " không phải là tuổi của một người!");
    }
}

function bai09() {
    let a = parseInt(prompt("Nhập cạnh a: ")),
        b = parseInt(prompt("Nhập cạnh b: ")),
        c = parseInt(prompt("Nhập cạnh c: "));
    if (a>0 && b>0 && c>0 && a+b>c && b+c>a && a+c>b){
        alert("Đây là 3 cạnh của một tam giác!");
    }
    else {
        alert("Đây không phải là 3 cạnh của một tam giác!");
    }
}

function bai10() {
    let dien1 = parseInt(prompt("Nhập đơn giá 50kWh đầu: ")),
        dien2 = parseInt(prompt("Nhập đơn giá từ 50 - 100kWh: ")),
        dien3 = parseInt(prompt("Nhập đơn giá 101 - 200kWh: ")),
        dien4 = parseInt(prompt("Nhập đơn giá 201 - 300kWh: ")),
        dien5 = parseInt(prompt("Nhập đơn giá 300+kWh: "))
        tieuthu = parseInt(prompt("Nhập số kWh đã dùng: ")),
        tongtien;
    if (tieuthu <= 50){
        tongtien = dien1 * tieuthu;
    }
    else if (50 < tieuthu <= 100){
        tongtien = dien1*50 + dien2*(tieuthu - 500);
    }
    else if (100 < tieuthu <= 200){
        tongtien = dien1*50 + dien2*50 + dien3*(tieuthu - 100);
    }
    else if (200 < tieuthu < 300) {
        tongtien = dien1*50 + dien2*50 + dien3*100 + dien4*(tieuthu - 200);
    }
    else {
        tongtien = dien1*50 + dien2*50 + dien3*100 + dien4*100 + dien5*(tieuthu - 300);
    }
    alert("Tổng tiền điện là: " + tongtien);
}

function bai11() {
    let thunhap = parseInt(prompt("Nhập thu nhập: ")),
        thue;
    if (thunhap <= 5000000){
        thue = thunhap*0.05;
    }
    else if (5000000 < thunhap <= 10000000){
        thue = thunhap*0.1 - 250000;
    }
    else if (10000000 < thunhap <= 18000000){
        thue = thunhap*0.15 - 750000;
    }
    else if (18000000 < thunhap <= 32000000){
        thue = thunhap*0.2 - 1650000;
    }
    else if (32000000 < thunhap <= 52000000){
        thue = thunhap*0.25 - 3250000;
    }
    else if (52000000 < thunhap <= 80000000){
        thue = thunhap*0.3 - 5850000;
    }
    else {
        thue = thunhap*0.35 - 9850000;
    }
    alert("Thuế thu nhập là: " + thue);
}

function bai12() {
    let v = parseInt(prompt("Nhập số tiền vốn ban đầu: ")),
        r = parseFloat(prompt("Nhập lãi suất: ")),
        t = parseInt(prompt("Nhập số tháng gửi tiền: ")),
        A = v * Math.pow((1+r), t);
    alert("Tổng vốn lẫn lãi thu được là: " + A.toFixed(2));
}