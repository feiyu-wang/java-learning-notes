数组(Array)是Java 语言中内置的一种基本数据存储结构，通俗的理解，就是一组数的集合，目的是用来一次存储多个数据。数组是程序中实现很多算法的基础，可以在一定程度上简化代码的书写。Java 语言中的数组可以分为：一维数组和多维数组，本部分将首先以一维数组为基础进行讲解，最后讲解多维数组的概念和相关的理解、使用。
数组概述
在程序中，如果需要存储一个数值的话，则可以在代码中声明一个变量来进行存储，但是有些时候，为了程序操作的方便，需要将一组相关的数值存储在一起，这就是数组出现的最初原因。在实际使用时，数组的目的就是存储一组相关的数据，例如棋牌游戏中的一副牌等，从存储数值的角度考虑，其作用是和变量等价的。则实际使用时，数组名称是一个整体，类似学校里的班级名称，为了
能够方便的访问数组中的某个具体的值，对数组中的值进行强制的编号，这个编号称作数组的下标，类似班级中每个学员的序号。在实际引用数组中的值时，使用数组名称和下标一起进行指定，类似于XX 班级序号为n 的学员。为了数组管理的方便，所以在语法上要求数组中存放的每个元素类型必须相同。数组中的每个具体的数值也称作数组元素。在内存中，数组存储在连续的区域内部，因为数组中每个元素的类型相同，则占用的内存大小也一致，所以在访问数组中的元素时可以直接根据数组在内存中的起始位置以及下标来计算元素的位置，因此数组的访问速度很高。实际使用时，每个数组都有长度，为了方便管理，在Java 语言中，在初始化数组时，必须指定数组的长度，而且一旦指定，长度就不能改变，除非在重新初始化该数组。了解了数组以上相关的概念以后，在实际使用数组时，数组的类型、数组的长度以及数组中每个元素的功能，都由程序员根据需要进行指定，这些都需要一定的设计技巧，也是初学者最不熟悉的问题。这个问题可以简单的这么理解，就像有了一块泥巴，只要你按照规则来做，可以根据你的需要做成任意的结构，制作过程和制作方法都由制作者进行设计。虽然数组从结构上来看，只是把以前语法中的多个变量存储在一起，通过数组名称组合上下标的方式进行使用，这个简单的变化，将极大的简化程序算法的实现，所以说数组是数据存储方式的很大革新。或者套用一句时髦的话——“数据存储的一小步，确实算法实现的一大步”。数组的另外一个变革就是下标可以使用变量进行代表，这样在访问数组的值时会更加灵活，这个也是理解数组的关键。
总结来说，主要有以下几点：
1、数组中的元素类型必须相同。
2、数组的长度一旦指定即不能改变。
3、数组中的值通过数组名和下标组合起来进行访问。
------------------------------------------------------------------------------------------------------------------------------------------------------------
数组基本语法
了解了数组的概念以后，下面来看一下数组的语法格式。数组的语法格式主要有四种：数组声明、数组初始化、引用数组元素和获得数组长度。数组声明和变量类似，数组在使用以前也必须声明，数组的声明语法格式为：
数据类型数    组名称[]
或：
数据类型[]   数组名称
例如：
int m[];
char c[];
double d[];
这里的数据类型可以是Java 语言的任意数据类型，也就是说既可以是基本数据类型也可以是复合数据类型。在声明数组时使用一对中括号，该对中括号既可以放在数据类型的后面，也可以放在数组名称的后面。数组名称是一个标识符，可以根据需要设置其名称，在程序中使用该名称代表该数组。这两种声明的语法格式在实际使用时完全等价，可以根据习惯进行使用。数组声明以后在内存中不占用空间，没有地址，由于数组是复合数据类型，所以声明完成以后其默认值是null。数组声明以后不能直接使用，必须对其初始化以后才可以进行使用。
数组初始化
数组初始化就是对数组进行赋值。数组的初始化语法分为两种：静态初始化和动态初始化。静态初始化适用于已知数组所有元素的值，一次初始化所有元素，动态初始化只申请空间，每个元素的值是数组声明时数据类型对应的初始值。
静态初始化
静态初始化，也称数组的整体赋值，是一次为数组中所有元素依次进行赋值的语法，通过可以语法可以指定数组中每个元素的值，同时也指定了数组的长度。
语法格式为：
数据类型[] 数组名称= {值1,值2,……,值n};
例如：
int[] m = {1,2,3,4};
char c[] = {‘a’,’f’,’d’};
静态初始化必须和数组的声明位于同一行，换句话说，只能在声明数组的同时进行静态初始化。数组中的所有元素书写一对大括号的内部，系统按照值的书写顺序依次为数组运算进行赋值，例如数组m，则将1 赋值给m 数组的第一个元素，2 赋值给m 数组的第二个元素，依次类推，数组的总长度等于静态初始化时数值的个数。在实际书写时，需要注意，值的类型必须和数组声明时的类型匹配，或者可以自动进行转换。在实际程序中，静态初始化一般书写一组已知的无规律数值，这样书写起来比较简单，格式比较统一。
动态初始化
动态初始化，也就是只为数组指定长度，并且在内存中申请空间。动态初始化可以不必和数组的声明放在一起，也可以重新初始化一个初始化的数组。
动态初始化的语法格式：
数据类型[] 数组名称= new 数据类型[长度];
例如：
int[] m = new int[10];
char[] c;
c = new char[3];
动态初始化使用new 关键字进行初始化，new 关键字后续的数据类型要求和数组声明时的数据类型一样，中括号内部是需要初始化的数组长度，该长度值可以是数字也可以是整型变量，如果是整型变量则不能为long 型。在实际使用时，也可以先声明再进行动态初始化。动态初始化指定了数组的长度，在内存中申请了对应长度的空间，而每个元素的值取数组数据类型对应的默认值。
默认值的规定如下：
a、boolean 类型的默认值是false。
b、其它7 种基本数据类型是0。说明：char 的默认值是编码为0 的字符，而不是字符0。
c、复合数据类型的初始值是null。
动态初始化只专注于为数组申请对应长度的空间，具体存储的元素的值可以根据需要依次进行指定。
---------------------------------------------------------------------------------------------------------------------------------------------------------------
引用数组元素
数组是一组数的集合，在实际使用时还需要引用数组中的每个元素。
则引用数组中元素的语法格式为：
数组名称[下标]
其中下标指数组中每个元素的索引值，Java 语法规定数组中的第一个元素索引值是0，第二个是1，依次类推。在程序书写时，下标位置既可以书写常数也可以书写变量。而整个引用元素的表达式可以看作是一个变量，该变量的类型和数组的类型一致。
示例代码如下：
int[] m = {3,2,4,6};
m[1] = 4;
m[2] = m[3] + m[0];
在代码中，可以使用变量作为下标，示例代码如下：
char[] ch = new char[10];
int i = 2;
ch[i] = ‘a’;
使用变量作为数组的下标，极大的增强了数组元素使用的灵活性，也是灵活使用数组必须深刻理解的内容。因为数组的下标都从0 开始，所以有效的数组下标区间是0 到数组的长度减1，其它的下标都是非法的。在代码中出现非法的下标不会出现语法错误，但是会导致运行时出现异常。
获得数组长度
为了方便的操作数组，Java 语法中提供了获得数组长度的语法格式。对于一个已经初始化完成的数组，获得该数组长度的语法格式为：
数组名称.length
示例代码如下：
int[] n = {1,2,3,4,6};
int len = n.length;
则在该代码中n.length 代表数组n 的长度，由数组的初始化可以看出数组n 的长度是5，则变量len 的值将是5。使用该语法，可以只需要知道数组的名称就可以获得数组的长度，便于灵活操作数组。综合前面下标的语法和长度的语法，则输出数组n 中所有元素的代码
为：
for(int i = 0;i < len;i++){
            System.out.println(n[i]);
}
这种使用数组的方式称作数组的遍历，遍历数组是使用数组的基础，也是很多和数组相关逻辑实现的基础。关于数组的语法就介绍这么，下面通过一些示例来演示数组的实际使用。
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
数组使用示例
循环初始化数组元素
要求：初始化一个长度为100 的int 数组，数组中的元素依次为1-100。这是一个基本的使用，主要是熟悉数组的语法，在实际编写时，需要发现数组下标和数组元素值之间的规律即可。
第一种思路：循环数组的下标0-99，则和下标对应的元素的值比数组下标多1。
则实现代码如下：
int[] m = new int[100];
for(int i = 0;i < m.length;i++){
        m[i] = i + 1;
}
代码说明：声明并初始化一个长度是100 的数组，使用循环循环数组的下标，下标的区间是[0,m.length-1]，其中m.length 表示数组的长度。在实际赋值时，把数组的下标做成变量，则当i 的值为0 时，则m[i]就是m[0]，依次类推，按照题目的要求，则数值的规律是i+1，这样循环结束以后，数组m 中的值就依次是1-100 了。
第二种思路：循环数组的值1-100，则下标比数组的值下1。
则实现的代码如下：
int[] m = new int[100];
for(int i = 1;i <= 100;i++){
        m[i – 1] = i;
}
该代码中循环变量i 的值从1 循环到100，则数组的下标是i – 1，这样也可以实现题目要求的功能。
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
输出数列
要求：输出1 1 2 3 5 8 13……这样的数列，输出该数列的前20 个数字。该题是一个基本的数字逻辑，在实际解决该问题时，首先要发现该数字的规律，然后按照该规律来设计数组即可。
实现思路：数字的规律是除了数列里的前两个数字以外，其它的数字都满足该数字等于前两个数字的和，由于题目要求输出前20 个数字，所以需要一个长度为20 的数组，第一个和第二个数字直接赋值，后续的数字通过前两个数字元素得到。
则实现的代码如下：
int[] num = new int[20];
num[0] = 1;
num[1] = 1;
//循环初始化
for(int i = 2;i < num.length;i++){
        num[i] = num[i – 1] + num[i – 2];
}
//循环输出
for(int i = 0;i < num.length;i++){
        System.out.print(num[i]);
        System.out.print(‘ ‘);
}
System.out.println(); //换行
在该代码中，初始化一个长度为20 的数组，首先将数组中的前两个元素赋值成1，然后循环对后续的元素的赋值，如果当前元素的下标是i，则它前一个元素的下标是i-1，再前面一个元素的下标是i-2，只需要将这2 个元素的值相加，然后赋值给当前元素即可。后面使用一个循环，输出数组中所有的元素，元素和元素之间有一个间隔的空格，在输出所有的元素以后换行。
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
歌手打分
要求：在歌唱比赛中，共有10 位评委进行打分，在计算歌手得分时，去掉一个最高分，去掉一个最低分，然后剩余的8 位评委的分数进行平均，就是该选手的最终得分。如果已知每个评委的评分，求该选手的得分。该题实际上涉及到求数组的最大值、最小值，以及求数组中所有元素的和，也是数组方便统计的用途体现。
实现思路：求出数组元素的最大值、最小值以及和，然后使用和减去最大值和最小值，然后除以8 获得得分。
则实现的代码如下：
int[] score = {90,78,90,96,67,86,78,92,79,85}; //评委打分
int sum = 0; //存储和
int max =score[0]; //存储最大值
int min = score[0]; //存储最小值
//求和
for(int i = 0;i < score.length;i++){
        sum += score[i];
}
//获得最大值
for(int i = 1;i < score.length;i++){
        //比较
        if(max < score[i]){
                max = score[i];
        }
}
//获得最小值
for(int i = 1;i < score.length;i++){
        //比较
        if(min > score[i]){
        min = score[i];
        }
}
//计算平均分
double avg = (sum – max – min)/8.0;
System.out.println(avg);
在该代码中，实现数组求和的思路和以前的一样，就是每次加一个元素，然后用得到的结果再和后续的元素依次相加。求最大值的思路是首先假设第一个元素最大，把score[0]赋值给max，然后使用max 的值和后续依次比较，如果后续的元素比max 大，则把该值赋值给max，然后再和后续的元素比较，求最小值的思路和最大值的思路一样。然后计算平均分就完成了题目的要求。该代码虽然结构比较清晰，但是效率不高，为了追求效率，可以把以上三个循环合并起来，
代码如下：
for(int i = 0;i < score.length;i++){
        sum += score[i]; //求和
        //获得最大值
        if(max < score[i]){
        max = score[i];
        }
        //获得最小值
        if(min > score[i]){
        min = score[i];
        }
}
这样虽然在结构上稍微复杂了一些，但是效率得到了改善。在实际编写程序时，一般会在功能书写完成以后，对代码进行优化，提高程序的执行效率。
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
判断数组元素是否重复
要求：判断一个数组中是否存在相同的元素，如果存在相同的元素则输出“重复”，否则输出“不重复”。
该题中如果需要判断数组中元素是否重复，则需要对数组中的元素进行两两比较，如果有任意一组元素相等，则该数组中的元素存在重复，如果任意一组元素都不想等，则表示数组中的元素不重复。
实现思路：假设数组中的元素不重复，两两比较数组中的元素，使用数组中的第一个元素和后续所有元素比较，接着使用数组中的第二个元素和后续元素比较，依次类推实现两两比较，如果有一组元素相同，则数组中存储重复，结束循环。把比较的结果存储在一个标志变量里，最后判断标志变量的值即可。
则实现的代码如下：
int[] n = {1,2,3,1,0};
boolean flag = true; //假设不重复
for(int i = 0;i < n.length – 1;i++){ //循环开始元素
        for(int j = i + 1;j < n.length;j++){ //循环后续所有元素
                //如果相等，则重复
                if(n[i] == n[j]){
                flag = false; //设置标志变量为重复
                break; //结束循环
                }
        }
}
//判断标志变量
                if(flag){
                System.out.println(“不重复”);
                }else{
                System.out.println(“重复”);
}
在该代码中，flag 变量存储是否重复，true 代表不重复，false 代表重复。外部循环中循环变量i 代表第一个元素的下标，内部循环中循环变量j代表后续元素的下标，当i 为零时和后续所有元素比较，然后当i 为1 时也和后续所有元素比较，依次类推，这样实现所有元素之间的两两比较。然后如果元素相同，则代表有重复，把flag 变量的值置成flase，结束循环。最后根据flag变量的值就可以判断是否重复了。
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
判断数组是否对称
要求： 判断数组元素是否对称。例如{1}、{1,2,0,2,1},{1,2,3,3,2,1}这样的都是对称数组。
该题中用于判断数组中的元素关于中心对称，也就是说数组中的第一个元素和最后一个元素相同，数组中的第二个元素和倒数第二个元素相同，依次类推，如果比较到中间，所有的元素都相同，则数组对称。
实现思路：把数组长度的一半作为循环的次数，假设变量i 从0 循环到数组的中心，则对应元素的下标就是数组长度-i-1，如果对应的元素有一组不相等则数组不对称，如果所有对应元素都相同，则对称。
则实现的代码如下：
int[] n = {1,2,0,2,1};
boolean flag = true; //假设对称
for(int i = 0;i < n.length/2;i++){ //循环数组长度的一半次
//比较元素
            if(n[i] != n[n.length – i – 1]){
            flag = false; //不对称
            break; //结束循环
            }
}
            if(flag){
            System.out.println(“对称”);
            }else{
            System.out.println(“不对称”);
}
在该代码中，flag 作为标志变量，值为true 代表对称，false 代表不对称，因为是两两比较，只需要比较数组的长度一半次即可，如果对应的元素不相同则数组不对称，结束循环。最后判断标志变量的值，就可以获得数组是否对称了。
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
数制转换
要求：将十进制数字转换为二进制数字。
在前面介绍过，十进制数字转换为二进制数字时一般使用除二取余法，该方法很规则，在程序中可以通过循环实现，在程序中只需要把得到的数字存储起来即可。
实现思路：将除二取余得到的第一个数字存储在数组中第一个元素，第二次得到的余数存储在数组中第二个元素，依次类推，最后反向输出获得的数字即可。
实现代码如下：
int n = 35;
int[] m = new int[32];
//拆分数字
int num = 0;
while(n != 0){
        m[num] = n % 2; //存储余数
        num++; //拆分数字增加1
        n /= 2; //去掉余数
}
//输出拆分后的数字
for(int i = num - 1;i >= 0;i--){
        System.out.print(m[i]);
}
    System.out.println();
在该代码中，因为int 是32 位的，所以最多需要长度是32 的数组即可。在存储时把拆分出的第一个数字，也就是二进制的低位，存储在数组的第一个元素，num 代表拆分出的数字的个数以及数组下标，一直拆分到n 的值为零时结束。循环结束后，因为拆分出来的数字个数是num，所以只需要反向输出数组中0 到num-1 下标的元素即可。
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
数字统计
要求：统计一个整数中出现最多的数字。如果数字个数一样，则以最大的数字为准，例如1 输出1，121 输出1，23231 输出3。
该题是一个综合的题目，在实际分析时可以分解成三个问题：1、把整数中的每个数字拆分出来，2、统计拆分出的数字中0-9 每个的个数，3、获得数字个数的最大值。
实现思路：
1、拆分数字：整数和10 取余可以获得该整数的个位值，然后用该整数除以10可以去掉个位(整数除法)，按照这种结构实现循环，并把拆分出的数字(也就是余数)存储到数组中。
2、统计数字：声明一个长度是10 的整型数组，使用这个数组中的第一个元素保存数字0 出现的次数，第二个元素保存数字1 出现的次数，依次类推。使用循环实现数字个数的统计。
3、获得最大值对应的数字：获得个数数组中最大值的下标，就是需要的数字。
则实现的代码如下：
int m = 1232312;
int[] n = new int[10];         //存储拆分后的数字
int num = 0;                         //存储拆分出的数字个数
while(m != 0){                     //未拆分完
            n[num] = m % 10;         //获得个位数字
            num++;                         //拆分出的数字个数加1
            m /= 10;                     //去掉拆分出的数字
}
int[] count = new int[10]; //存储0-9 数字出现的次数
//统计数字出现的次数
for(int i = 0;i < num;i++){
            count[n[i]]++;
}
//获得最大值的下标
int index = 0;
for(int i = 0;i < count.length;i++){
            if(count[index] <= count[i]){
            index = i;
            }
}
//输出
System.out.println(index);
在该代码中，拆分的十进制的数字，首先拆分出个位，并存储到n 数组中，然后通过除10 去掉拆分出的数字，继续执行循环，一直运算到m 为0 时为止，变量num 保存拆分出的数字的个数。使用数组count 记忆0-9 每个数字出现的次数，count[0]存储0 出现的次数，count[1]存储1 出现的次数,依次类推，所以当n[i]的值为几时，只需要count[n[i]]增加1 即可。最后使用循环获得最大数字的下标，适用<=进行比较，可以保证当个数相同时取后续的数字，这样就可以通过循环获得最大数值的下标，按照数组count 的结构，数组的下标和就是数字的值。
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
数组编码
要求：设有一数组A，长度是N，内部的数据是0 到N-1 之间的所有数字，例如当N 等于5 时，数组为：A={0,3,2,1,4}。针对A 数组，有一个对应的编码数组B，B 的长度和A 的长度相等，规定数组B 中元素的值规定如下：
a、B[0]的值为0
b、B[i]的值是A 数组中A[i]以前的值中比A[i]小的元素的个数。
c、例如示例中A 数组{0,3,2,1,4}对应的编码数组B 的值为{0,1,1,1,4}。现在已知A 数组，编码代码计算对应的编码数组B。
该题是一个基本的数组变换题目，只要熟悉了题目的要求以后，按照题目的要求求解对应的数组B 即可。
实现思路：初始化一个长度和A 数组一样的B 数组，初始化第一个元素的值为0，循环统计比A[i]元素小的数字个数，把个数值赋值给对应的B[i]即可。
则实现的代码如下：
int[] A = {0,3,2,1,4};
int[] B = new int[A.length];
B[0] = 0; //初始化第一个元素，可选
for(int i = 1;i < A.length;i++){
            int count = 0; //计数变量
//统计小于A[i]元素的数量
for(int j = i - 1;j >= 0;j--){
            if(A[j] < A[i]){
            count++;
            }
}
B[i] = count; //赋值
}
该代码中，按照数组B 中值的规定，统计A[i]以前比A[i]小的元素个数，然后把得到的结果赋值给B[i]即完成题目的要求。
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
数组排序
要求：将数组中的元素按照从小到大的顺序(升序)进行排列。
数组的排序是实现很多数组操作的基础，在实际使用时也有很多的排序方法，这里以冒泡排序为例来说明数组的排序算法。
实现思路：每次排序一个元素，总的排序次数是数组的长度减1 次。第一次时，首先比较第一个和第二个元素，如果第一个元素比第二个元素大，则交换这两个元素的值，然后比较第二个和第三个元素，如果第二个比第三个大则交换，依次类推，这样当第一次交换完成以后，数组中的最后一个元素一定是数组中最大的元素。第二次时，只比较数组的前长度减一个元素，比较步骤和第一次相同，依次类推，每次都少比较一个元素，最终获得的就是排序完成的数组。
则实现的代码如下：
int[] m = {2,10,3,4,2};
for(int i = 0;i < m.length - 1;i++){ //排序次数
            //两两比较，实现排序
            for(int j = 0;j < m.length - 1 - i;j++){
                    if(m[j] > m[j + 1]){
                            //交换
                            int temp = m[j];
                            m[j] = m[j + 1];
                            m[j + 1] = temp;
                    }
            }
}
//输出排序后的元素
for(int i = 0;i < m.length;i++){
        System.out.println(m[i]);
}
冒泡排序通过数组中元素的两两比较和交换，实现数组中元素的排序。其中循环变量为i 的循环代表排序的次数，总的排序次数是数组的长度减1 次。内部的循环变量为j 的循环实现未排序元素的两两比较，其中循环条件可以保证i 增加1，内部比较的元素减少1，这个在功能上就是不比较排过序的元素。