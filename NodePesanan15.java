public class NodePesanan15 {
    Pesanan15 data;
    NodePesanan15 prev;
    NodePesanan15 next;

    public NodePesanan15(NodePesanan15 prev, Pesanan15 data, NodePesanan15 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}