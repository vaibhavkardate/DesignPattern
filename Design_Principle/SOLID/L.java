package Design_Principle.SOLID;

interface SocialMedia {  
    public void chatWithFriend();
    public void sendPhotosAndVideos()
 }

 interface SocialPostAndMediaManager { 
    public void publishPost(Object post);
}
interface VideoCallManager{ 
    public void groupVideoCall(String... users);
 }

 class Instagram implements SocialMedia ,SocialPostAndMediaManager{
    public void chatWithFriend(){
        //logic
       }
       public void sendPhotosAndVideos(){
        //logic
       }
       public void publishPost(Object post){
        //logic
       }
    }

