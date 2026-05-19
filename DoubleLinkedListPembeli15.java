public class DoubleLinkedListPembeli15 {

    NodePembeli15 head;
    NodePembeli15 tail;

    int size;
    int nomorAntrian = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(String nama, String hp) {

        Pembeli15 pembeli =
                new Pembeli15(nomorAntrian++, nama, hp);

        NodePembeli15 newNode =
                new NodePembeli15(null, pembeli, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;

        System.out.println("Pembeli masuk ke antrian!");
    }
    public void cetakAntrian() {

    if (isEmpty()) {
        System.out.println("Antrian kosong!");
        return;
    }

    System.out.println("\n=== DAFTAR ANTRIAN ===");

    NodePembeli15 current = head;

    while (current != null) {

        System.out.println("No Antrian : "
                + current.data.noAntrian);

        System.out.println("Nama       : "
                + current.data.namaPembeli);

        System.out.println("No HP      : "
                + current.data.noHp);

        System.out.println("-------------------------");

        current = current.next;
    }
}

    public Pembeli15 hapusAntrian() {

        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }

        Pembeli15 dataKeluar = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;

        return dataKeluar;
    }
}