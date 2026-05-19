public class DoubleLinkedListPesanan15 {
    NodePesanan15 head;
    NodePesanan15 tail;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(Pesanan15 pesanan) {
        NodePesanan15 newNode = new NodePesanan15(null, pesanan, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public void sortingPesanan() {
        if (head == null) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;
            NodePesanan15 current = head;

            while (current.next != null) {
                if (current.data.namaPesanan
                        .compareToIgnoreCase(current.next.data.namaPesanan) > 0) {

                    Pesanan15 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    tukar = true;
                }

                current = current.next;
            }
        } while (tukar);
    }

    public void tampilPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan!");
            return;
        }

        sortingPesanan();

        System.out.println("\n=== LAPORAN PESANAN ===");

        NodePesanan15 current = head;
        int total = 0;

        while (current != null) {
            System.out.println("Kode Pesanan : " + current.data.kodePesanan);
            System.out.println("Nama Menu    : " + current.data.namaPesanan);
            System.out.println("Harga        : Rp" + current.data.harga);
            System.out.println("---------------------------");

            total += current.data.harga;
            current = current.next;
        }

        System.out.println("Total Pendapatan : Rp" + total);
    }
}