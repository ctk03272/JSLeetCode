/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function (s) {
    let stringList = s.split("");
    let stringMap = {};
    let start = 0;
    let answer=0;
    stringList.reduce((acc, cur, index) => {
        debugger
        if (stringMap[cur]==null) {
            stringMap[cur] = index;
            if(answer<acc){
                answer=acc;
            }
            return acc + 1;
        } else {
            for (let i = start; i <= stringMap[cur]; i++) {
                delete(stringMap[stringList[i]]);
                acc--;
            }
            start=stringMap[cur]+1;
            stringMap[cur] = index;
            return acc+1;
        }
    }, 0);
    return answer;
};
​
console.log(lengthOfLongestSubstring("aabaab!bb"))
