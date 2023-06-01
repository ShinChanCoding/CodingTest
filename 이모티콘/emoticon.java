function solution(player, emoticons) {
const max = [0, 0];
const sale = [10, 20, 30, 40];
const arr = [];
        function dfs(emoticons, result) {
            if (emoticons.length < 1) {
                arr.push(result);
                return;
            }
            for (let i=0; i<sale.length; i++) {
                dfs(emoticons.slice(1), [...result, [sale[i], emoticons[0]]]);
            }
        }
        dfs(emoticons, []);
    const salAmt = (sal, price) => (100-sal) / 100 * price;
        arr.forEach(salArr => {
        const accrue = [0, 0]
        player.forEach(([per, price]) => {
            let sum = 0;
            salArr.forEach(([sal, cost]) => {
                if(sal >= per) {
                    sum += salAmt(sal, cost);
                }
            });
            if(sum >= price) {

                // 19) 서비스 증가
                accrue[0] += 1;
            } else {
                accrue[1] += sum;
            }
        });
        
        if(max[0] < accrue[0]) {
            
            max[0] = accrue[0];
            max[1] = accrue[1];
        } else if(max[0] === accrue[0]) {
            
            if(max[1] < accrue[1]) {
                
                max[1] = accrue[1];
            }
        }
        
    });
        
        return max;
    }
