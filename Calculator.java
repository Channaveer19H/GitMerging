public class Calculator {
	public int addition(int a, int b) {
//		Created in main branch
		return a + b;
	}

	public int substraction(int a, int b) {
//		Created in feature-A branch
		return a - b;
	}

	public int multiply(int a, int b) {
//		Created in feature-B branch
		return a * b;
	}
}

We create a repo with main branch.
Did some changes

create feature-A branch
create feature-B branch

add few changes in feature-A
add few changes in feature-B

merge feature-A branch into main branch (Fats Forward)
now main branch = main branch + feature-A branch

switch to the feature-B branch -> $ git rebase main

might be some conflict -> resolve conflict manually -> $ git add . -> $ git commit -m ""

$git rebase --continue

Now feature-B branch = main branch + feature-A branch + feature-B branch

merged back from feature-B to main branch

$ git checkout main
$ git checkout feature-B (Fast Forward)
