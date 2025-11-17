public class Phonebook{
    private Node head;

    public void addContact(String name,String phoneNumber){
        Contact contact=new Contact(name,phoneNumber);
        Node newNode=new Node(contact);

        if(head==null){
            head=newNode;
            return;
        }

        if(name.compareTo(head.data.name)<1){
            newNode.next=head;
            head=newNode;
            return;
        }

        Node current=head;

        while(current.next!=null&&name.compareTo(current.next.data.name)>0){
            current=current.next;
        }

        newNode.next=current.next;
        current.next=newNode;
    }

    public void printDirectory(){
        Node current=head;
        System.out.println("-------PHONEBOOK-------");
        int order=1;
        while(current!=null){
            System.out.println("1 -> "+current.data);
            current=current.next;
            order++;
        }
    }
    public void deleteByName(String name){
        if(head==null){
            System.out.println("There is no contact to delete!");
            return;
        }

        if(head.data.name.equalsIgnoreCase(name.trim())){
            System.out.println("Contact "+head.data+" has been deleted.");
            head=head.next;
            return;
        }

        Node current=head;
        while(current.next!=null&&!current.next.data.name.equalsIgnoreCase(name.trim())){
            current=current.next;
        }

        if(current.next!=null){
            System.out.println("Contact "+current.next.data+" has been deleted.");
            current.next=current.next.next;
        }else{
            System.out.println("Contact not found.");
        }
    }
}
