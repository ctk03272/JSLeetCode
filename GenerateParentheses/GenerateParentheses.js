/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
        let result=[];
    let makeArray=function(left,right,parenthesis,input){
​
        if(left==n && right==n){
            result.push(parenthesis+input);
            return;
        }
        if(left>n || right>n || left<right){
            return;
        }
        makeArray(left+1,right,parenthesis+input,"(");
        makeArray(left,right+1,parenthesis+input,")");
    }
    makeArray(1,0,"","(");
    return result;
};
