public class SignUpManager
{
    private IUserCheckService iUserCheckService;

    public SignUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }


    public void signUp(User user)
    {
        if(iUserCheckService.checkUser(user))
        {
            System.out.println("User did register:"+user.getName());
        }
        else {
            System.out.println("User didn't register!");
        }
    }

}
