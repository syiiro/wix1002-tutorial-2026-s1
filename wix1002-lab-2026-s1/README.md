# WIX1002 Labs — 2026 Semester 1

Lab materials for **WIX1002 Fundamentals of Programming**. Each lab has its own folder. Fork this repository, create your Java projects inside the matching lab folder, then commit and push your work to your own fork.

Submit Java source and project files directly. You do not need to write a Markdown answer file for the labs.

## Lab materials

| Lab | Topic | Questions | Supporting files |
| --- | --- | --- | --- |
| 01 | Getting Started with Java | [PDF](lab-01/L-1002-01.pdf) | — |
| 02 | Java Fundamental | [PDF](lab-02/L-1002-02.pdf) | — |
| 03 | Flow of Control (Selection) | [PDF](lab-03/L-1002-03.pdf) | — |
| 04 | Flow of Control (Repetition) | [PDF](lab-04/L-1002-04.pdf) | — |
| 05 | Arrays | [PDF](lab-05/L-1002-05.pdf) | — |
| 06 | Java Methods | [PDF](lab-06/L-1002-06.pdf) | — |
| 07 | File Input and Output | [PDF](lab-07/L-1002-07.pdf) | [Lab07.zip](lab-07/Lab07.zip) |
| 08 | Class | [PDF](lab-08/L-1002-08.pdf) | — |
| 09 | Inheritance | [PDF](lab-09/L-1002-09.pdf) | [Lab09.zip](lab-09/Lab09.zip) |
| 10 | Polymorphism | [PDF](lab-10/L-1002-10.pdf) | — |

## 1. Prepare your tools

Install Git and a Java Development Kit (JDK) compatible with your IDE and your lecturer's requirements. Choose Eclipse IDE for Java Developers, Apache NetBeans, or VS Code with the Extension Pack for Java. VS Code also needs Git installed for its built-in Git features.

For the command-line workflow, check:

```bash
git --version
java -version
javac -version
```

A JDK includes `javac`; a runtime alone is insufficient. IDE menu names can vary slightly between versions.

## 2. Fork the repository on GitHub

1. Sign in to GitHub and open [the course lab repository](https://github.com/FSKTMCoders/wix1002-lab-2026-s1).
2. Click **Fork**.
3. Choose your personal account as owner and keep the name `wix1002-lab-2026-s1`.
4. Click **Create fork**.
5. Confirm that the address contains **your own GitHub username**.

**Access prerequisite:** if this repository is private, you need access and the repository/organization must permit forks. If **Fork** is unavailable, contact your lecturer before continuing. The lecturer must enable student access and permitted forking, or provide another approved repository setup.

Use your fork's URL everywhere below:

```text
https://github.com/YOUR-USERNAME/wix1002-lab-2026-s1.git
```

Replace `YOUR-USERNAME` with your actual username. Choose **one** of the workflows below; you only need to clone once.

## 3. Organize your Java projects

Read the lab PDF first. Create projects under the corresponding `lab-XX` directory, using project names requested in the questions. For questions without a prescribed project name, use a clear name such as `L2Q1`. A lab can contain several projects:

```text
wix1002-lab-2026-s1/
├── README.md
├── .gitignore
├── lab-01/
│   ├── L-1002-01.pdf
│   ├── L1Q2/                 # Java project for Lab 1, Question 2
│   │   ├── src/
│   │   ├── build.xml         # Example: NetBeans Ant project
│   │   └── nbproject/
│   ├── L1Q3/
│   └── L1Q4/
├── lab-02/
│   ├── L-1002-02.pdf
│   └── L2Q1/
│       └── src/
│           └── l2q1/
│               └── Main.java
└── ...
```

The projects shown above are examples for students to create; they are not prebuilt solutions. Follow any required class names, packages, build tools, or project structure in the PDF. In particular, Lab 1 Question 2 specifies a NetBeans **Java with Ant** project named `L1Q2` and class `l1q2.MyProfile`; use the NetBeans workflow for that task.

Keep the supplied PDFs and ZIPs. For Labs 7 and 9, extract the matching ZIP when needed, inspect its supplied files, and copy required inputs into your project's working directory. Relative file paths are resolved from the working directory used when running the program. Configure that directory in your IDE or adjust your relative paths accordingly. Commit required input data with your project.

Use the single Git repository at the cloned root. Do not initialize another Git repository inside a lab or project folder.

## Workflow A: Git commands

### A1. Clone your own fork

Open Terminal or Git Bash and run:

```bash
git clone https://github.com/YOUR-USERNAME/wix1002-lab-2026-s1.git
cd wix1002-lab-2026-s1
git remote -v
git branch --show-current
```

Check that `origin` points to **your fork**, and that the current branch is `main`. If the remote points to the course repository, correct it:

```bash
git remote set-url origin https://github.com/YOUR-USERNAME/wix1002-lab-2026-s1.git
```

Set your commit identity in this repository:

```bash
git config user.name "Your Name"
git config user.email "your-verified-email@example.com"
```

Use your verified GitHub email or GitHub no-reply email. This records authorship; it does not authenticate you.

### A2. Create and run a project

For a simple source-only project, this example creates folders for Lab 2 Question 1. Run from the repository root:

```bash
mkdir -p lab-02/L2Q1/src/l2q1
```

In your editor, create `lab-02/L2Q1/src/l2q1/Main.java`:

```java
package l2q1;

public class Main {
    public static void main(String[] args) {
        // Write your solution here.
    }
}
```

Implement the question, save, and compile/run from the project folder:

```bash
cd lab-02/L2Q1
javac -d out src/l2q1/Main.java
java -cp out l2q1.Main
cd ../..
```

The final command returns to the repository root. The compile command is for this single-file example; add other source files when your solution uses multiple classes. For Ant or Maven projects, use the project's build tool or IDE. Run and check your program with appropriate inputs before committing.

### A3. Review and commit

From the repository root:

```bash
git status
git add lab-02/L2Q1
git diff --cached
git commit -m "Complete Lab 02 Question 1"
```

Review all staged files. Include `.java` files, required inputs, and project configuration such as `build.xml`, shared `nbproject` files, `pom.xml`, or Eclipse `.project`/`.classpath` files as applicable. The supplied `.gitignore` excludes common build output and local IDE state.

### A4. Push to your own fork

```bash
git remote -v
git push origin main
```

Authenticate when prompted. For HTTPS, use the supported browser/credential-manager flow or a personal access token when a token is required; GitHub account passwords do not authenticate Git pushes. See [GitHub authentication guidance](https://docs.github.com/en/get-started/git-basics/about-remote-repositories#cloning-with-https-urls).

Open your fork on GitHub and check that the project and `.java` files appear under the correct lab folder.

## Workflow B: Eclipse IDE built-in Git tools (EGit)

1. Open **Window → Show View → Other → Git → Git Repositories**. Choose **Clone a Git repository**, paste your fork's URL, select `main`, and clone outside the Eclipse workspace. If already cloned, use **Add an existing local Git repository** instead.
2. Choose **File → New → Java Project**. For example, name it `L2Q1`, clear **Use default location**, and set its location to `<clone>/lab-02/L2Q1`. Choose the JDK and finish. Create packages/classes under `src`, then run with **Run As → Java Application**.
3. If Git actions are missing, right-click the project → **Team → Share Project → Git** and select the existing repository at the clone root. Do not create another repository.
4. Open **Git Staging**. Review changes and move the relevant source, inputs, and shared project files from **Unstaged Changes** to **Staged Changes**. Check author/committer identity and enter a message such as `Complete Lab 02 Question 1`.
5. Click **Commit**, then use **Team → Push to Upstream**. Verify the destination is your fork's `main`; complete authentication. Verify the uploaded files on GitHub.

Reference: [Eclipse EGit guide](https://help.eclipse.org/latest/topic/org.eclipse.egit.doc/help/EGit/User_Guide/Tasks.html).

## Workflow C: Apache NetBeans built-in Git tools

1. Choose **Team → Git → Clone**, enter your fork's URL, select `main`, and choose a local destination. Complete the wizard. No Java projects exist to open yet. If already cloned, skip cloning.
2. Choose **File → New Project → Java with Ant → Java Application**. For Lab 1 Question 2, set **Project Name** to `L1Q2` and **Project Location** to `<clone>/lab-01`. Confirm **Project Folder** becomes `<clone>/lab-01/L1Q2`. Set **Create Main Class** to `l1q2.MyProfile`, then finish.
3. Write your code. Use **Run Project** to test and **Clean and Build** when requested. For other questions, repeat with the appropriate lab folder and project name.
4. Select the project and use **Team → Commit** (or right-click → **Git → Commit**). Review included files, check your author identity, enter a meaningful message, and commit. NetBeans detects the parent clone's repository; do not initialize another one.
5. Choose **Team → Remote → Push**, select `origin`, verify your fork's URL, choose local `main` → remote `main`, and finish. Authenticate and check the uploaded files on GitHub.

References: [NetBeans Git tools](https://netbeans.apache.org/tutorial/main/kb/docs/ide/git/) and [Java project creation](https://netbeans.apache.org/tutorial/main/kb/docs/java/javase-intro/).

## Workflow D: VS Code built-in Source Control

1. Install **Extension Pack for Java**. Open the Command Palette with `Ctrl+Shift+P` (Windows/Linux) or `Cmd+Shift+P` (macOS), run **Git: Clone**, paste your fork's URL, choose a destination, and open the clone. If already cloned, use **File → Open Folder** on the clone root.
2. Run **Java: Create Java Project**, choose **No build tools**, select `<clone>/lab-02` as the parent, and name the project `L2Q1`. Confirm the resulting folder is `<clone>/lab-02/L2Q1`. Reopen the repository root if the wizard opens only the project folder.
3. Edit the generated Java sources and add classes. Follow prescribed names/packages in the PDF. Click **Run** above a `main` method or use **Run Java** to test.
4. Open **Source Control**, select the lab repository, review changes, and click **+** beside the files to stage. Enter a message and click **Commit**. If identity is missing, configure it using the commands in A1 in the integrated terminal.
5. Choose **… → Push** in Source Control. Confirm `origin` is your fork and the branch is `main`, sign in if prompted, then verify on GitHub.

References: [VS Code Java projects](https://code.visualstudio.com/docs/java/java-project) and [Source Control quickstart](https://code.visualstudio.com/docs/sourcecontrol/quickstart).

## 4. Repeat for every lab and verify your work

For each remaining question, create its project in the matching `lab-XX` folder, implement and test it, commit, then push. A commit saves a local snapshot; pushing uploads it to GitHub. Check your fork after each push.

Before finishing, confirm that your fork contains all required Java projects, source files, shared build configuration, and input data, and that the latest commit appears on GitHub. Generated `.class` files and build folders can be recreated locally; keep them out of version control. If a lab explicitly asks you to exchange a built JAR, build it locally and share it as directed.

If a push is rejected because the remote has newer commits, pull and resolve any conflicts before pushing again (command-line example: `git pull --rebase origin main`). Do not force-push to bypass the rejection. No pull request to the course repository is required by this guide.
