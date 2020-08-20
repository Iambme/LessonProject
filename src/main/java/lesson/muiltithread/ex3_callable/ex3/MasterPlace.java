package lesson.muiltithread.ex3_callable.ex3;

import java.util.ArrayList;
import java.util.List;

public class MasterPlace {
    private List<MyThread> mastersInWork;
    private List<Master> masters;
    private List<TV> tvs;
    private int maxSize = 3;
    public MasterPlace() {
        mastersInWork = new ArrayList<>();
        masters = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            masters.add(new Master());
        }
        tvs = new ArrayList<>();

    }

    public List<TV> getTvs() {
        return tvs;
    }

    public void addTv(TV tv){
        tvs.add(tv);
    }

    public Master getFreeMaster(){
        for (int i = 0; i < masters.size(); i++) {
            if(!mastersInWork.contains(new MyThread(masters.get(i)))){
                return masters.get(i);
            }
        }
        return null;

    }

    public void startRepair(){


        while(tvs.size()>0){
            if(mastersInWork.size()<maxSize){

                Master master = getFreeMaster();
                master.addTv(tvs.remove(0));
                MyThread thread = new MyThread(master);
                mastersInWork.add(thread);
                thread.start();
                try {
                    Thread.sleep((int)(Math.random()*2500)+100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < mastersInWork.size(); i++) {
                    if(!mastersInWork.get(i).isAlive()){
                        mastersInWork.remove(i--);
                    }
                }

            }else{
                for (int i = 0; i < mastersInWork.size(); i++) {
                    if(!mastersInWork.get(i).isAlive()){
                        mastersInWork.remove(i--);
                    }
                }
            }

        }


    }
}
