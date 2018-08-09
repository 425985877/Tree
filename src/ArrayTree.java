import java.io.*;
public class ArrayTree {
    public static void main(String args[])throws IOException{
        int i,level;
        int data[]={6,3,5,9,7,8,4,2};
        int btree[]= new int[16];
        for(i=0;i<16;i++) btree[i]=0;
        System.out.print("原始数组内容： \n");
        for(i=0;i<8;i++)
            System.out.print("["+data[i]+"]");
        System.out.println();
        for(i=0;i<8;i++){
            //把原始数组中的值逐一对比
            for(level=1;btree[level]!=0;) {
                //比较树根及数组内的值
                if (data[i] > btree[level])
                    //如果数组内的值大于树根，则往右子树比较
                    level = level * 2 + 1;
                else
                    //如果数组内的值小于或等于树根，则往左子树比较
                    level = level * 2;
            }
            btree[level]=data[i];
        }
        System.out.print("二叉树内容：\n");
        for (i=1;i<16;i++)
            System.out.print("["+btree[i]+"]");
        System.out.print("\n");
    }
}

