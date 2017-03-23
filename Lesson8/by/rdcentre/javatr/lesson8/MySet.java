package Lesson8.by.rdcentre.javatr.lesson8;

/**
 * Created by Denis on 22.03.2017.
 */
public class MySet<E> {
    private int n;
    {
        n = 3;
    }
    private int nNextAvailable = 0;
    private int hash;
    MySetRec mSet[] =  new MySetRec[n];

    public int myHashCode(E data){
        if (data != null) {
            return data.hashCode();
        }
        else
            return 0;
    }

    public void copyArray(){
        int newArrTempLength = n + 5;
        MySetRec mTempSet[] = new MySetRec[newArrTempLength];
        System.arraycopy(mSet,0,mTempSet,0,mSet.length);
        setNextAvailable(mSet.length);
        mSet = mTempSet;
        n = newArrTempLength;
    }
    public boolean addElement(E data){
        if (getNextAvailable() == mSet.length ){
            copyArray();
        }
        if (checkIfExists(data)) {
            return false;
        }
        else {
            MySetRec a = new MySetRec();
            a.data = data;
            mSet[getNextAvailable()] = a;
            setNextAvailable(getNextAvailable() + 1);
        }
        return true;
    }
    private boolean checkIfExists(E data){
        if (data == null) return false;
        for(int j=0; j < mSet.length; j++) {
            if (mSet[j] != null) {
                if (this.myHashCode((E) mSet[j].data) == this.myHashCode(data) && mSet[j].data.equals(data)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void showMySet(){
        for(int i = 0; i< mSet.length; i++){
            if (mSet[i] != null) {
                System.out.println(" " + mSet[i].data);
            }
            else
                System.out.println(" " + mSet[i]);
        }
    }
    public int getNextAvailable() {
        return nNextAvailable;
    }

    public void setNextAvailable(int nNextAvailable) {
        this.nNextAvailable = nNextAvailable;
    }
}
