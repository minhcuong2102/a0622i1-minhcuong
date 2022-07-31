function bai_01() {
    let a = [
        [1, 2, 1, 24],
        [8, 11, 9, 4],
        [7, 0, 7, 27],
        [7, 4, 28, 14],
        [3, 10, 26, 7]
    ];
    for (let i in a) {
        console.log("row " + i);
        for (let j in a[i]) {
            console.log(" " + a[i][j]);
        }
    }
}

function bai_02() {
    let arr = [];
    let soPhanTu = prompt("Nhập số phần tử: ");
    for (let i = 0; i < soPhanTu; i++){
        arr.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    alert("Mảng đã nhập là: " + arr.join(", "));

    let first = 0;
    let last = arr.length - 1;
    while (first < last){
        let tmp = arr[first];
        arr[first] = arr[last];
        arr[last] = tmp;
        first++;
        last--;
    }
    alert("Mảng đã đảo ngược là: " + arr.join(""));
}

function bai_03() {
    let arr = [
        [1, 2, 0, 13],
        [8, 4, 9, 3],
        [0, 4, 7, 32, 6, 5, 7, 2],
        [4, 7, 2, 3],
        [10, 7, 4, 2, 3, 7]
    ];
    let cnt = 0;
    console.log(arr);

    for(let i = 0;i < arr.length; i++){
        for(let j = 0; j < arr[i].length; j++){
            cnt++;
        }
    }
    alert("Số kí tự: " + cnt);
}

function bai_04() {
    let chuoi = prompt("Nhập chuỗi: ");
    let dayKiTu = [];
    for (let a of chuoi){
        dayKiTu.push(a);
    }
    alert("Độ dài của chuỗi đã viết là: " + dayKiTu.length)
}

function bai_05() {
    let a = [];
    let b = [];
    let soPhanTu = +prompt("Nhập số phần tử:");
    for (let i = 0; i < soPhanTu; i++){
        a.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    for (let i = 0; i < soPhanTu; i++){
        b.push(prompt("Nhập phần tử thứ " + (i+1)));
    }

    alert("Mảng a: " + a);
    alert("Mảng b: " + b);

    let value1 = "";
    let value2 = "";
    for(let i = 0;i < a.length;i++){
        for(let j = 0;j < a[i].length;j++){
            value1 += a[i][j];
        }
    }
    for(let i = 0;i < b.length; i++){
        for(let j = 0; j < b[i].length; j++){
            value2 += b[i][j];
        }
    }
    if(value1 === value2){
        alert("Hai mảng giống nhau!");
    }else {
        alert("Hai mảng khác nhau!");
    }
}

function bai_06() {
    let arr = [""];
    let soPhanTu = prompt("Nhập số phần tử: ");
    for (let i = 0; i < soPhanTu; i++){
        arr.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    alert("Mảng đã nhập là: " + arr.join(""));

    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === "-"){
            arr[i] = "_";
        }
    }
    alert("Hàm đã sửa là: " + arr.join(""));
}