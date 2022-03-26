public class Generic<T> implements Interface<T> {
    private Node front;
    private Node rear;
    private int size;

    public Generic() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public class Node<T> {
        T data;
        Node next;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void enQ(T data) {
        Node node = new Node(data);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.setNext(node);
            rear = node;
        }
        System.out.println("Pekerjaan Berhasil Ditambah");
        size++;
    }

    @Override
    public T delQ() {
        Node task = front;
        if (isEmpty()) {
            System.out.println("Tidak ada pekerjaan");
            System.out.println();
        } else {
            if (front == rear) {
                front = null;
                rear = null;
            } else {
                front = task.getNext();
                task.setNext(null);
            }
            System.out.println("Pekerjaan " + ((Queue) task.getData()).namaPekerjaan + "telah dihapus");
            size++;
        }
        return null;
    }

    @Override
    public void first() {
        if (isEmpty()) {
            System.out.println("Pekerjaan kosong");
            System.out.println();
        } else {
            ((Queue) front.getData()).display();
        }
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Pekerjaan kosong");
            System.out.println();
        } else {
            Node task = front;
            System.out.println("Jumlah Pekerjaan : " + size);
            while (task != null) {
                ((Queue) task.getData()).display();
                task = task.getNext();
            }
        }
    }
}


