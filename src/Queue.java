public class Queue {
    String namaPekerjaan;

    public Queue(String namaPekerjaan){
        this.namaPekerjaan = namaPekerjaan;
    }
    public void display(){
        System.out.println("Nama Pekerjaan: "+ namaPekerjaan);
        System.out.println();
    }
}
