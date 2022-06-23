package Hashtable;

import lombok.Data;


public class EmpLinkedList {
   private Emp head;
   private Emp end;
   
   public void add(Emp emp){
      if(head == null){
         head=emp;
         end=emp;
      }else{
         end.setNext(emp);
         end=emp;
      }

   }

   public void deleteEmpById(int id){
      Emp ep=head;
      if(head==null){
         System.out.println("链表为空");

      }else{

         if(ep.getId()==id){
            if(ep.getNext()==null){
               head=null;
            }else{
               Emp nep= ep.getNext();
               ep.setNext(nep.getNext());
            }

         }else{

            while(ep!=null) {
               if (ep.getNext().getId() == id) {
                  Emp nep= ep.getNext();
                  ep.setNext(nep.getNext());
                  break;
               } else {
                  ep = ep.getNext();
               }

            }

         }

         }




   }

   
   public Emp getEmpById(int id){
      Emp ep=head;
      if(head==null){
         System.out.println("链表为空");
         return null;
      }else{
         while(ep!=null) {

            if (ep.getId() == id) {
               return ep;
            } else {
               ep = ep.getNext();
            }
         }
      }
      return null;
   }

   public void toStringEmp(){
       Emp ep=head;
      if(ep==null){
         System.out.println("emp链表为空");
         return;
      }else{
         while(ep!=null){
            System.out.println(ep.toString());
            if(ep.getNext()==null){

               break;
            }else{
               ep=ep.getNext();
            }

         }
      }

   }



   public Emp getHead() {
      return head;
   }

   public void setHead(Emp head) {
      this.head = head;
   }

   public Emp getEnd() {
      return end;
   }

   public void setEnd(Emp end) {
      this.end = end;
   }
}
