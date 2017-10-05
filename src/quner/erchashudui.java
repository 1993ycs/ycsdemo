package quner;

public class erchashudui {

    /**
    #include <iostream>
    #include <vector>
    using namespace std;

    struct BinaryTreeNode{
        BinaryTreeNode(){
            lson = NULL;
            rson = NULL;
        }
        int value;
        BinaryTreeNode* lson;
        BinaryTreeNode* rson;
    };

    void Print(int* path,int n){
        for(int i = 0;i < n;i++){
            cout << path[i] << "";
        }
        cout << endl;
    }

    void PrintPath(BinaryTreeNode* root,int*path,int pos,int sum,int k,int &res){
        if(path == NULL)return;

        if(root == NULL){
            if(sum == k){
                //Print(path,pos);
                res++;
            }
            return;
        }

        path[pos] = root->value;
        PrintPath(root->lson,path,pos + 1,sum + root->value,k,res);
        PrintPath(root->rson,path,pos + 1,sum + root->value,k,res);
    }

    void CreateBinaryTree(int arr[],int n,BinaryTreeNode** root,int i){
        if(arr == NULL || n <= 0)return;
        if(i >= n)return;
        if(arr[i] == 'N'){
    	*root = NULL;
        }
        else{
    	*root = new BinaryTreeNode;
            (*root)->value = arr[i];
        }
        CreateBinaryTree(arr,n,&(*root)->lson,2*i + 1);
        CreateBinaryTree(arr,n,&(*root)->rson,2*i + 2);
    }

    int main(){
        int k;
        cin >> k;
        int n;
        vector<int> vc;
        while(~scanf("%d",&n)){
            vc.push_back(n);
            if(getchar() == '\n')break;
        }
    int *arr = new int[vc.size()];
        int i = 0;
        while(i < vc.size()){
            arr[i] = vc[i];
            i++;
        }
        BinaryTreeNode* root = NULL;
        CreateBinaryTree(arr,vc.size(),&root,0);
        int* path = new int[vc.size()];
        int res = 0;
        PrintPath(root,path,0,0,k,res);
        cout << res;
        return 0;
    }
     */
}
