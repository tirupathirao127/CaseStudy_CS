package case_study.gitV3.pojo;

public class Plan
{
    private String private_repos;

    private String name;

    private String collaborators;

    private String space;

    public String getPrivate_repos ()
    {
        return private_repos;
    }

    public void setPrivate_repos (String private_repos)
    {
        this.private_repos = private_repos;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getCollaborators ()
    {
        return collaborators;
    }

    public void setCollaborators (String collaborators)
    {
        this.collaborators = collaborators;
    }

    public String getSpace ()
    {
        return space;
    }

    public void setSpace (String space)
    {
        this.space = space;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [private_repos = "+private_repos+", name = "+name+", collaborators = "+collaborators+", space = "+space+"]";
    }
}
