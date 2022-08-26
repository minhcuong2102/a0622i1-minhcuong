function bai4_1() {
    function deleteSpace(str) {
        let arr1 = str.split(" ");
        let cnt = 0;
        for (let i = 0; i < arr1.length; i++) {
            if (arr1[i] === " ") {
                for (let j = i; j < arr1.length; j++) {
                    if (arr1[j] === " ") {
                        cnt++;
                    } else {
                        break;
                    }
                }
            }
            if (cnt !== 0) {
                arr1.splice(i, cnt);
                cnt = 0;
            }
        }
        return arr1;
    }

    function capitalizeFirstLetter(mang) {
        return mang.map(function (element) {
            return element.replace(element.charAt(0), element.charAt(0).toUpperCase());
        });
    }

    function findLongestWord(mang) {
        let max = mang[0].length;
        let cnt = 0;
        for (let i = 1; i < mang.length; i++) {
            if (max < mang[i].length) {
                max = mang[i].length;
                cnt = i;
            }
        }
        return mang[cnt];
    }

    let str = prompt("Nhập chuỗi: ").toLowerCase();
    console.log(str);
    let mang = deleteSpace(str);
    console.log(mang);
    mang = capitalizeFirstLetter(mang);
    alert("Chuỗi đã thay đổi là: " + mang.join(" "));
    alert("Từ dài nhất là: " + findLongestWord(mang));
}

function bai4_2() {
    function differentSymbolsNaive(str) {
        let arr1 = str.split("");
        let arr2 = [];
        let flag = true;
        arr2[0] = arr1[0];
        for (let i = 0; i < arr1.length; i++) {
            for (let j = 0; j < arr2.length; j++) {
                if (arr1[i] === arr2[j]) {
                    flag = false;
                    break;
                } else {
                    flag = true;
                }
            }
            if (flag) {
                arr2.push(arr1[i]);
            }
        }
        return arr2.length;
    }

    let str = prompt("Nhập chuỗi: ");
    alert("Số kí tự khác nhau trong chuỗi là: " + differentSymbolsNaive(str));
}

function bai4_3() {
    function ghepSoLienKe(arr) {
        let tmp = [];
        for (let i = 0; i < arr.length; i++) {
            let str = arr[i];
            while (arr[i] == arr[i + 1]) {
                str += arr[i + 1];
                i++;
            }
            tmp.push(str);
        }
        return tmp;
    }

    function commonCharacterCount(str, arr, arr3) {
        let mangTach = [];
        for (let i = 0; i < str.length; i++) {
            mangTach.push(str.substr(i));
        }
        loop1:
            for (let i = 0; i < mangTach.length; i++) {
                loop2:
                    for (let j = 0; j < arr.length; j++) {
                        if (mangTach[i] == arr[j]) {
                            arr3.push(mangTach[i]);
                            break loop1;
                        }
                    }
            }
    }

    let str1 = prompt("Nhập chuỗi thứ nhất: ");
    let str2 = prompt("Nhập chuỗi thứ hai: ");
    let arr1 = ghepSoLienKe(str1);
    let arr2 = ghepSoLienKe(str2);
    let arr3 = [];
    for (let i = 0; i < arr1.length; i++) {             // Kiểm tra phần tử chung mảng 1 so với mảng 2 rồi thêm các PT chung vào mảng 3
        commonCharacterCount(arr1[i], arr2, arr3);
    }

    for (let j = 0; j < arr2.length; j++) {             // Kiểm tra phần tử chung mảng 2 so với mảng 1 rồi thêm các PT chung vào mảng 3
        commonCharacterCount(arr2[j], arr1, arr3);
    }

    for (let k = 0; k < arr3.length; k++) {            // Loại bỏ các phần tử chung trong mảng 3
        for (let h = k + 1; h < arr3.length; h++) {
            if (arr3[k] == arr3[h]) {
                arr3.splice(k, 1);
                k--;
                break;
            }
        }
    }
    alert(arr3);
}