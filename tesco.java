
Git reports this because ~/qwerty is not inside a Git repository: it cannot find a .git directory there or in any parent directory.

Your ls output shows another directory named qwerty inside the current one. If that inner directory is your repository, enter it first:
