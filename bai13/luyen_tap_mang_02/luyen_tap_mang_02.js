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
    let arr = [];
    let soPhanTu = prompt("Nhập số phần tử: ");
    for (let i = 0; i < soPhanTu; i++){
        arr.push(prompt("Nhập phần tử thứ " + (i+1)));
    }
    alert("Mảng đã nhập là: " + arr.join(", "));
    alert("Kích thước mảng là: " + arr.length);
    let cnt = 0;
    for (let i in arr){
        if (typeof arr[i] == "number"){
            cnt++;
        }
    }
    alert("Số kí tự số trong mảng là: " + cnt);
}

function bai_04() {

}

function bai_05() {

}

function bai_06() {

}