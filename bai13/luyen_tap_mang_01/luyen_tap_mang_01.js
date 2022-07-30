function bai01() {
    let num = [];
    for (let i = 0; i < 10; i++){
        num.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    alert("Dãy số đã nhập là: " + num.join(", "));

    let a = [];
    let cnt = 0;
    for (let i = 0; i < num.length; i++){
        if (num[i] >= 10){
            a.push(num[i]);
            cnt++;
        }
    }
    alert("Có " + cnt + " số nguyên lớn hơn 10: " + a.join(", "));
}

function bai02() {
    let num = [];
    for (let i = 0; i < 10; i++){
        num.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    alert("Dãy số đã nhập là: " + num.join(", "));

    let max = num[0];
    let index = 0;
    for (let i = 1; i < num.length; i++){
        if (num[i] > max){
            max = num[i];
            index = i + 1;
        }
    }
    alert("Số lớn nhất là: " + max + ", là số thứ " + index + " trong dãy số.");
}

function bai03() {
    let num = [];
    let soPhanTu = prompt("Nhập số phần tử: ");
    for (let i = 0; i < soPhanTu; i++){
        num.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    alert("Dãy số đã nhập là: " + num.join(", "));

    let max = num[0];
    let index = 0;
    for (let i = 1; i < num.length; i++){
        if (num[i] > max){
            max = num[i];
            index = i + 1;
        }
    }
    alert("Số lớn nhất là: " + max + ", là số thứ " + index + " trong dãy số.");

    let average = 0;
    for (let i = 0; i < num.length; i++) {
        average += num[i];
    }
    average /= soPhanTu;
    alert("Giá trị trung bình là: " + average);
}

function bai04() {
    let num = [];
    let soPhanTu = prompt("Nhập số phần tử: ");
    for (let i = 0; i < soPhanTu; i++){
        num.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    alert("Dãy số đã nhập là: " + num.join(", "));

    let first = 0;
    let last = num.length - 1;
    while (first < last){
        let tmp = num[first];
        num[first] = num[last];
        num[last] = tmp;
        first++;
        last--;
    }
    alert("Mảng đã đảo ngược là: " + num.join(", "));
}

function bai05() {
        let num = [];
        let soPhanTu = prompt("Nhập số phần tử: ");
        for (let i = 0; i < soPhanTu; i++){
            num.push(prompt("Nhập phần tử thứ " + (i+1)));
        }
        alert("Dãy số đã nhập là: " + num.join(", "));

    let a = [];
    let cnt = 0;
    for (let i = 0; i < num.length; i++){
        if (num[i] < 0){
            a.push(num[i]);
            cnt++;
        }
    }
    alert("Có " + cnt + " số nguyên âm: " + a.join(", "));
}

function bai06() {
    let num = [];
    for (let i = 0; i < 10; i++){
        num.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    alert("Dãy số đã nhập là: " + num.join(", "));

    let V = prompt("Nhập số V: ");
        if (num.includes(V)){
            alert("V có nằm trong mảng!");
        }else {
            alert("V không nằm trong mảng!");
        }
}

function bai07() {
    let num = [];
    for (let i = 0; i < 10; i++){
        num.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    alert("Dãy số đã nhập là: " + num.join(", "));

    let V = prompt("Nhập số V: ");
        if (num.indexOf(V) >= 0){
            alert("V có nằm trong mảng!");
            num.splice(num.indexOf(V), 1);
        }else {
            alert("V không nằm trong mảng!");
        }
    alert("Dãy số mới là: " + num.join(", "));
}

function bai08() {
    let num = [];
    for (let i = 0; i < 10; i++){
        num.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    alert("Dãy số đã nhập là: " + num.join(", "));

    num.sort(function (a, b) {
        return b - a;
    })
    alert("Dãy số mới là: " + num.join(", "));
}

function bai09() {
    let a = [];
    let b = [];
    for (let i = 0; i < 10; i++){
        a.push(prompt("Nhập vào mảng a phần tử thứ " + (i+1)));
    }
    for (let i = 0; i < 10; i++){
        b.push(prompt("Nhập vào mảng b phần tử thứ " + (i+1)));
    }
    console.log(a, b);
    let c = a.concat(b);
    alert("Dãy số đã gộp là: " + c.join(", "));
}