function bai4_1() {
    function deleteSpace(str) {
        let arr1 = str.split(" ");
        let cnt = 0;
        for (let i = 0; i < arr1.length; i++) {
            if (arr1[i] === " "){
                for (let j = i; j < arr1.length; j++) {
                    if (arr1[j] === " "){
                        cnt++;
                    }else {
                        break;
                    }
                }
            }
            if (cnt !== 0){
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

    function findLongestWord(mang){
        let max = mang[0].length;
        let cnt = 0;
        for (let i = 1; i < mang.length; i++) {
            if (max < mang[i].length){
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
    function differentSymbolsNaive(str){
        let arr1 = str.split("");
        let arr2 = [];
        let flag = true;
        arr2[0] = arr1[0];
        for (let i = 0; i < arr1.length; i++) {
            for (let j = 0; j < arr2.length; j++) {
                if (arr1[i] === arr2[j]){
                    flag = false;
                    break;
                }else {
                    flag = true;
                }
            }
            if (flag){
                arr2.push(arr1[i]);
            }
        }
        return arr2.length;
    }

    let str = prompt("Nhập chuỗi: ");
    alert("Số kí tự khác nhau trong chuỗi là: " + differentSymbolsNaive(str));
}

function bai4_3() {
    function commonCharacterCount(str1, str2){
        let arr1 = str1.split("");
        let arr2 = str2.split("");
        console.log(arr1, arr2);
        let arr3 = [];
        for (let i = 0; i < arr1.length; i++) {
            for (let j = 0; j < arr2.length; j++) {
                if (arr1[i] === arr2[j]){
                    let temp = arr1[i];
                    let a = ++i;
                    let b = ++j;
                    while (arr1[a] === arr2[b]){
                        temp += arr1[a];
                        a++; b++; i++; j++;
                    }
                    arr3.push(temp);
                }
            }
        }
        console.log("Các kí tự giống nhau là: " + arr3);
        return arr3.length;
    }

    let str1 = prompt("Nhập chuỗi thứ nhất: ")
    let str2 = prompt("Nhập chuỗi thứ hai: ")
    alert("Số kí tự giống nhau là: " + commonCharacterCount(str1, str2));
}